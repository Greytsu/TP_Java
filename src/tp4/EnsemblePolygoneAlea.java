package tp4;

import java.util.ArrayList;

import static tp4.RandInt.getRandomInt;

public class EnsemblePolygoneAlea {

    private ArrayList<Polygone> polygones = new ArrayList<>();
    private int countPolygone = 0;
    private int countRectangle = 0;
    private int countTriangle = 0;
    private int countCercle = 0;

    //CTOR--------------------------------------------------------------------
    public EnsemblePolygoneAlea(int nbPoly){

        for(int i = 0; i < nbPoly; i++){
            this.polygones.add(creePolygoneAlea());
        }

    }

    //Methods-----------------------------------------------------------------
    private Polygone creePolygoneAlea(){

        int typePoly = getRandomInt(0,2);
        Polygone poly;

        switch(typePoly){

            //Rectangle
            case 0:
                poly = new Rectangle(new Point(), new Point());
                this.countRectangle += 1;
                break;

            //Triangle
            case 1:
                ArrayList<Point> pointsTriangle = new ArrayList<>();
                for(int i = 0; i < 3; i++){
                    pointsTriangle.add(new Point());
                }
                poly = new Triangle(pointsTriangle);
                this.countTriangle += 1;
                break;

            //Polygone
            default:
                int cotes = getRandomInt(5, 20);
                ArrayList<Point> pointsPoly = new ArrayList<>();
                for(int i = 0; i < cotes; i++){
                    pointsPoly.add(new Point());
                }
                poly = new Polygone(cotes, pointsPoly);
                this.countPolygone += 1;
                break;

        }

        return poly;
    }

    public double sommeSurface(){

        double somme = 0;
        for(Polygone poly : this.polygones){
            somme += poly.surface();
        }
        return somme;
    }


    //Overrides
    @Override
    public String toString() {

        StringBuilder line = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int polygone = 0;
        int rectangle = 0;
        int triangle = 0;
        int compteurPoly = 0;


        for(Polygone poly : this.polygones){
            i ++;

            if(poly instanceof Polygone){
                polygone++;
                compteurPoly = polygone;
            }
            if(poly instanceof Rectangle){
                rectangle++;
                compteurPoly = rectangle;
            }
            if(poly instanceof Triangle){
                triangle++;
                compteurPoly = triangle;
            }


            line.append("Polygone (n" + i + "), " + poly.getClass().getSimpleName() + " (n" + compteurPoly + ") : ");
            for(Point p : poly.points){
                line.append(p.toString() + ", ");
            }

            sb.append(line.toString());
            sb.append("\n");
            line = new StringBuilder();
        }

        return sb.toString();
    }
}
