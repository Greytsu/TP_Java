package tp4;

import tp4.interfaces.Dessinable;
import tp4.interfaces.Zoomable;

import java.util.ArrayList;
import java.util.Arrays;

public class Rectangle extends Quadrilatere implements Dessinable, Zoomable, Comparable {

    public Rectangle(Point p1, Point p2){

        super(construire(p1, p2));
    }

    private static ArrayList<Point> construire(Point leftTop, Point rightBot){

        Point rightTop, leftBot;

        rightTop = new Point(rightBot.getX(), leftTop.getY());
        leftBot = new Point(leftTop.getX(), rightBot.getY());

        return new ArrayList<>(Arrays.asList(leftTop, rightTop, rightBot, leftBot));
    }

    public double hauteur(){
        return this.points.get(1).distance(this.points.get(2));
    }

    public double largeur(){
        return this.points.get(0).distance(this.points.get(1));
    }

    public double surface(){
        System.out.println("Calcul la surface d'un Rectangle");
        return this.hauteur() * this.largeur();
    }

    @Override
    public void seDessiner() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Object o) {

        int result = 0;

        if(o instanceof Polygone){
            if(this.surface() < ((Polygone) o).surface()) result = -1;
            if(this.surface() == ((Polygone) o).surface()) result = 0;
            if(this.surface() > ((Polygone) o).surface()) result = 1;
        }

        if(o instanceof Cercle){
            if(this.surface() < ((Cercle) o).surface()) result = -1;
            if(this.surface() == ((Cercle) o).surface()) result = 0;
            if(this.surface() > ((Cercle) o).surface()) result = 1;
        }

        return result;
    }
}
