package tp5;

import tp5.exceptions.SommetNul;
import tp5.interfaces.Forme;

import java.util.ArrayList;
import java.util.Objects;

public class Polygone implements Forme {

    protected ArrayList<Point> points;
    private int cotes;


    //CTOR----------------------------------------------------------------------
    public Polygone(int cotes, ArrayList<Point> points)
    {
        Objects.requireNonNull(points);

        this.cotes = cotes;
        this.points = points;
    }

    //Methods-------------------------------------------------------------------
    public Point getPoint(int n){
        return this.points.get(n);
    }

    public void changePoint(int n, Point p){
        this.points.set(n, p);
    }

    //Forme---------------------------------------------------------------------
    @Override
    public double perimetre() throws SommetNul {

        if((this.points.get(this.cotes - 1).getX() == 0) && (this.points.get(this.cotes - 1).getY() == 0)){
            throw new SommetNul(this.cotes - 1);
        }

        double result = this.points.get(0).distance(this.points.get(this.cotes - 1));

        for(int i = 0; i < this.points.size()-1; i++){

            if((this.points.get(i).getX() == 0) && (this.points.get(i).getY() == 0)){
                throw new SommetNul(i);
            }

            result += this.points.get(i).distance(this.points.get(i+1));
        }

        return result;
    }

    @Override
    public double surface(){
        System.out.println("Calcul la surface d'un poolygone");
        return 0;
    }

    @Override
    public boolean dedans(Point p){
        return true ;
    }

    @Override
    public boolean plusGrand(Object o) {

        if(o instanceof Polygone){

            var poly = (Polygone)o;
            return this.surface() > poly.surface();
        }
        return false;
    }

    @Override
    public void translater(int x, int y) {

        for(Point p : this.points){
            p.setX(p.getX() + x);
            p.setY(p.getY() + y);
        }

    }


    //Overrides----------------------------------------------------------------
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(getClass().getSimpleName() + " ");
        for(Point p : points){
            sb.append(p.toString() + " ");
        }

        return sb.toString();

    }

}
