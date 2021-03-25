package tp4;

import java.util.ArrayList;

public class Triangle extends Polygone{

    public Triangle(ArrayList<Point> points){
        super(3, points);
    }

    public double surface() {

        System.out.println("Calcul la surface d'un triangle");
        double surface = (this.points.get(0).getX() * (this.points.get(1).getY() - this.points.get(2).getY()) + this.points.get(1).getX() * (this.points.get(2).getY() - this.points.get(0).getY()) + this.points.get(2).getX() * (this.points.get(0).getY() - this.points.get(1).getY())) / 2.0d;

        return Math.abs(surface);
    }
}
