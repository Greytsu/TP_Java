package tp2;

import tp2.Personne;

public class Test {
    public static void main(String[] args) {

        System.out.println("TP2");

        var p16 = new Personne("testNom16", "testPrenom16", Personne.HOMME, "25/08/1997", Personne.CELIBATAIRE);
        var p17 = new Personne("testNom17", "testPrenom17", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE);
        var p18 = new Personne("testNom18", "testPrenom18", Personne.HOMME, "25/08/1997", Personne.CELIBATAIRE);
        var p19 = new Personne("testNom19", "testPrenom19", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE);
        var p20 = new Personne("testNom20", "testPrenom20", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE);
        var p21 = new Personne("testNom21", "testPrenom21", Personne.HOMME, "25/08/1997", Personne.CELIBATAIRE);
        var p22 = new Personne("testNom22", "testPrenom22", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE);
        var p23 = new Personne("testNom23", "testPrenom23", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE);
        var p24 = new Personne("testNom24", "testPrenom24", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE);
        var p25 = new Personne("testNom25", "testPrenom25", Personne.HOMME, "25/08/1997", Personne.CELIBATAIRE);
        var p26 = new Personne("testNom26", "testPrenom26", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE);
        var p27 = new Personne("testNom27", "testPrenom27", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE);
        var p28 = new Personne("testNom28", "testPrenom28", Personne.HOMME, "25/08/1997", Personne.CELIBATAIRE);
        var p29 = new Personne("testNom29", "testPrenom29", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE);
        var p30 = new Personne("testNom30", "testPrenom30", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE);
        var p31 = new Personne("testNom31", "testPrenom31", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE);

        var p8 = new Personne("testNom8", "testPrenom8", Personne.HOMME, "25/08/1997", Personne.CELIBATAIRE, p16, p17);
        var p9 = new Personne("testNom9", "testPrenom9", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE, p18, p19);
        var p10 = new Personne("testNom10", "testPrenom10", Personne.HOMME, "25/08/1997", Personne.CELIBATAIRE, p20, p21);
        var p11 = new Personne("testNom11", "testPrenom11", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE, p22, p23);
        var p12 = new Personne("testNom12", "testPrenom12", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE, p24, p25);
        var p13 = new Personne("testNom13", "testPrenom13", Personne.HOMME, "25/08/1997", Personne.CELIBATAIRE, p26, p27);
        var p14 = new Personne("testNom14", "testPrenom14", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE, p28, p29);
        var p15 = new Personne("testNom15", "testPrenom15", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE, p30, p31);

        var p4 = new Personne("testNom4", "testPrenom4", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE, p8, p9);
        var p5 = new Personne("testNom5", "testPrenom5", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE, p10, p11);
        var p6 = new Personne("testNom6", "testPrenom6", Personne.HOMME, "25/08/1997", Personne.CELIBATAIRE, p12, p13);
        var p7 = new Personne("testNom7", "testPrenom7", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE, p14, p15);

        var p2 = new Personne("testNom2", "testPrenom2", Personne.FEMME, "22/08/1997", Personne.CELIBATAIRE, p4, p5);
        var p3 = new Personne("testNom3", "testPrenom3", Personne.HOMME, "25/08/1997", Personne.CELIBATAIRE, p6, p7);

        var p1 = new Personne("testNom1", "testPrenom1", Personne.HOMME, "25/08/1997", Personne.CELIBATAIRE, p2, p3);


        System.out.println(p1.estAncetre(p21));
        System.out.println(p13.estAncetre(p16));

        p1.afficherArbreGenealogique();


    }
}
