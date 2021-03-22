package tp3;

import java.util.ArrayList;
import java.util.List;

//import static tp3.Rectangle.createRectangle;
import tp3.Rectangle;

public class Test {

    public static void main(String[] args) {

        var p1 = new Point(0,1);
        var p2 = new Point(0,5);
        var p3 = new Point(2,2);
        var p4 = new Point(5,6);

        var points = new ArrayList();
        points.add(p1);
        points.add(p2);
        points.add(p3);

        System.out.println(p1.toString());

        var triangle = new Triangle(points);
        System.out.println(triangle.toString());

        var rect =  new Rectangle(p2, p3);

        var ensemblePolygones = new EnsemblePolygone(3);
        ensemblePolygones.ajouterPolygone(triangle);
        ensemblePolygones.ajouterPolygone(triangle);
        ensemblePolygones.ajouterPolygone(triangle);

        ensemblePolygones.affiche();

    }

}
