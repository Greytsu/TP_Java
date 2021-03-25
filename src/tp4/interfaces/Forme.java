package tp4.interfaces;

import tp4.Point;

import java.util.ArrayList;

public interface Forme {


    double perimetre();

    double surface();

    boolean dedans(Point p);

    boolean plusGrand(Object o);

    void translater(int x, int y);
}
