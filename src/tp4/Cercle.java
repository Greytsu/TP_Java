package tp4;

import tp4.interfaces.Dessinable;
import tp4.interfaces.Forme;
import tp4.interfaces.Zoomable;

public class Cercle implements Forme, Dessinable, Zoomable {

    private Point centre;
    private int rayon;

    public Cercle(Point centre, int rayon){

        this.centre = centre;
        this.rayon = rayon;
    }

    public double perimetre(){
        return 2 * Math.PI * this.rayon;
    }

    public double surface(){
        return Math.pow(this.rayon, 2) * Math.PI;
    }

    public boolean dedans(Point p){
        return true;
    }

    public boolean plusGrand(Object o){

        if(o instanceof Cercle){

            var cercle = (Cercle)o;
            return this.surface() > cercle.surface();
        }

        return false;
    }

    public void translater(int x, int y){
        this.centre.setX(this.centre.getX() + x);
        this.centre.setY(this.centre.getY() + y);
    }

    public void zoom(int zoomX){
        this.rayon = this.rayon * zoomX;
    }

    @Override
    public void seDessiner() {
        System.out.println(this.toString());
    }
}
