package tp3;

import java.util.ArrayList;

public class EnsemblePolygone {

    private ArrayList<Polygone> arrayPolygone;
    private int nbPolygones;

    public EnsemblePolygone(int nbPolygones){
        this.nbPolygones = nbPolygones;
        this.arrayPolygone = new ArrayList<Polygone>(nbPolygones);
    }

    public boolean ajouterPolygone(Polygone p){
        if(this.arrayPolygone.size() < this.nbPolygones){
            this.arrayPolygone.add(p);
            return true;
        }
        return false;
    }

    public double sommePerimetres(){

        double result = 0;
        for(Polygone p : arrayPolygone){
            result += p.perimetre();
        }

        return result;
    }

    public void affiche(){
        for(Polygone p : arrayPolygone){
            System.out.println(p.toString());
        }
    }

}
