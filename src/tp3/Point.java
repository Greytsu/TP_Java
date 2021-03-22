package tp3;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point p){
       return sqrt(pow((p.getX() - this.x),2) + pow((p.getY() - this.y),2));
    }

    public double distance(){
       return sqrt(pow(this.x,2) + pow(this.y,2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
