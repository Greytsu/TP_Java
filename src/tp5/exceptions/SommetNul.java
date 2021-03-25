package tp5.exceptions;

public class SommetNul extends PointNul {

    private int position;

    public SommetNul(){

    }
    public SommetNul(int position){
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
