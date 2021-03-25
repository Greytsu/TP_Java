package tp5;

import tp5.exceptions.PerimNul;
import tp5.exceptions.PointNul;
import tp5.exceptions.SommetNul;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class test_TP5 {
    public static void main(String[] args) {

        //Ex 1
        var ensemblePoly = new EnsemblePolygoneAlea(30);

        try {
            ensemblePoly.getPolygone(-3);
        }catch(ArrayIndexOutOfBoundsException e){
            //System.out.println("Error : Index ouf of bounds");
        }

        //Ex 2

        ArrayList<Point> points = new ArrayList<>();

        points.add(new Point(0,0));

        for(int i = 0; i < 4; i ++){
                points.add(new Point());
        }

        var poly = new Polygone(points.size(), points);

        try {
            poly.perimetre();
        }catch(SommetNul e){
            //System.out.println("Error : Un des sommets est null");
        }

        //Ex 3
        try {
            poly.perimetre();
        }catch(SommetNul e){
            //System.out.println("Error : Le sommet " + e.getPosition() + " est null");
        }

        //Ex4

        try{
            ensemblePoly.sommePerimetres();
        }catch(PerimNul e){
            System.out.println("Error : Le perimetre est null");
        }

        //Ex5
        try{
            var circle = new Cercle(new Point(), 0);
        }catch(InvalidParameterException e){
            //System.out.println("Error : Le rayon de ce cercle est null");
        }

        //Poly est un polygone avec un point null
        ensemblePoly.addPolygone(poly);

        try{
            ensemblePoly.sommePerimetres();
        }catch(PerimNul e){
            System.out.println("Error : Le perimetre est null");
            e.printStackTrace();
        }




    }
}
