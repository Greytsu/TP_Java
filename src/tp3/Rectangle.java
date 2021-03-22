package tp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Rectangle extends Quadrilatere{

    public Rectangle(Point p1, Point p2){

        super(construire(p1, p2));
    }

    private static ArrayList<Point> construire(Point leftTop, Point rightBot){

        Point rightTop, leftBot;

        rightTop = new Point(rightBot.getX(), leftTop.getY());
        leftBot = new Point(leftTop.getX(), rightBot.getY());

        return new ArrayList<Point>(Arrays.asList(leftTop, rightTop, rightBot, leftBot));
    }

    public double hauteur(){
        return this.points.get(1).distance(this.points.get(2));
    }

    public double largeur(){
        return this.points.get(0).distance(this.points.get(1));
    }

    public double surface(){
        return this.hauteur() * this.largeur();
    }

}
