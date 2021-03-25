package tp4;

import tp4.interfaces.Forme;

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
    public double perimetre(){
        double result = this.points.get(0).distance(this.points.get(this.cotes - 1));
        for(int i = 0; i < this.points.size()-1; i++){
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
