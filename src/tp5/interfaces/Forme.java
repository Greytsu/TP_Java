package tp5.interfaces;

import tp5.Point;
import tp5.exceptions.SommetNul;

public interface Forme {


    double perimetre() throws SommetNul;

    double surface();

    boolean dedans(Point p);

    boolean plusGrand(Object o);

    void translater(int x, int y);
}
