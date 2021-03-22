package tp3;

import java.util.ArrayList;
import java.util.Objects;

public class Polygone {

    private int cotes;
    protected ArrayList<Point> points;

    public Polygone(int cotes, ArrayList<Point> points)
    {
        Objects.requireNonNull(points);

        this.cotes = cotes;
        this.points = points;
    }

    public Point getPoint(int n){
        return this.points.get(n);
    }

    public void changePoint(int n, Point p){
        this.points.set(n, p);
    }

    public double perimetre(){
        double result = this.points.get(0).distance(this.points.get(this.cotes - 1));
        for(int i = 0; i < this.points.size()-1; i++){
            result += this.points.get(i).distance(this.points.get(i+1));
        }

        return result;
    }

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
