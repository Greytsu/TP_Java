package tp2;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Personne {

    //Constantes
    public static final String HOMME = "Monsieur";
    public static final String FEMME = "Madame";
    public static final String MARIE = "marié";
    public static final String CELIBATAIRE = "célibataire";
    public static final String INCONNU = "";
    public static final int NULL = 0000;

    //Var static
    private static int NUM_PERSONNE = 0;

    //Var
    private String nom, prenom, civilite, status;
    private String dateNaissance;
    private GregorianCalendar calendarDateNaissance;
    private Personne conjoint, parent1, parent2;
    private int numero;

    //Ctor
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
        NUM_PERSONNE += 1;
        this.numero = NUM_PERSONNE;
    }

    public Personne(String nom, String prenom, String civilite){
        this(nom, prenom);
        this.civilite = civilite;
    }

    public Personne(String nom, String prenom, String civilite, String dateNaissance){
        this(nom, prenom, civilite);
        this.dateNaissance = dateNaissance;

        calculCalendarDateNaissance();
    }

    public Personne(String nom, String prenom, String civilite, String dateNaissance, String status){
        this(nom, prenom, civilite, dateNaissance);
        this.status = status;
    }

    public Personne(String nom, String prenom, String civilite, String dateNaissance, String status, Personne parent1, Personne parent2){
        this(nom, prenom, civilite, dateNaissance, status);
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    //Setter - Getter---------------------------------------------------------------------------------------------------
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
        calculCalendarDateNaissance();
    }

    public GregorianCalendar getCalendarDateNaissance() {
        return calendarDateNaissance;
    }

    public void setCalendarDateNaissance(GregorianCalendar calendarDateNaissance) {
        this.calendarDateNaissance = calendarDateNaissance;
    }

    public Personne getConjoint() {
        return conjoint;
    }

    public void setConjoint(Personne conjoint) {
        this.conjoint = conjoint;
    }

    public int getNumero() {
        return numero;
    }

    //Methodes----------------------------------------------------------------------------------------------------------

    private void calculCalendarDateNaissance(){

        int day, month, year;
        String[] arrayDateNaissance = dateNaissance.split("/");

        day = Integer.parseInt(arrayDateNaissance[0]);
        month = Integer.parseInt(arrayDateNaissance[1]);
        year = Integer.parseInt(arrayDateNaissance[2]);

        calendarDateNaissance = new GregorianCalendar(year, month, day);
    }

    public int age(int anneeCourante){
        return anneeCourante - calendarDateNaissance.get(GregorianCalendar.YEAR);
    }

    public boolean plusJeune(Personne p){
        return (calendarDateNaissance.compareTo(p.getCalendarDateNaissance()) == 1);
    }

    public void marier(Personne p){
        if(this.conjoint == null){
            this.conjoint = p;
            this.status = Personne.MARIE;
            p.setConjoint(this);
            p.status = Personne.MARIE;
        }
    }

    public boolean estAncetre(Personne p){

        if(this.parent1 == null && this.parent2 == null)
            return false;

        if(this.parent1 == p || this.parent2 == p)
            return true;

        return this.parent1.estAncetre(p) || this.parent2.estAncetre(p);
    }

    public void afficherArbreGenealogique(){

        String indent = "-";
        System.out.println(this.prenom + " " + this.nom);

        if(this.parent1 == null && this.parent2 == null)
            return;

        if(this.parent1 != null)
            parent1.afficherArbreGenealogique(indent);

        if(this.parent2 != null)
            parent2.afficherArbreGenealogique(indent);

    }

    public void afficherArbreGenealogique(String indentation){

        String indent = "-";
        System.out.println(indentation + this.prenom + " " + this.nom);

        if(this.parent1 == null && this.parent2 == null)
            return;

        if(this.parent1 != null)
            parent1.afficherArbreGenealogique(indent + indentation);

        if(this.parent2 != null)
            parent2.afficherArbreGenealogique(indent + indentation);

    }

    @Override
    public String toString() {

        String msg;

        if(this.status.equals("marié") && this.civilite.equals("Madame")){
            return this.civilite + " " + this.prenom + " " + this.conjoint.getNom() + " (née " + this.nom + "), née le " + this.dateNaissance + ", mariée.";
        }

        return this.civilite + " " + this.prenom + " " + this.nom + ", né le " + this.dateNaissance + ", " + status + ".";

    }
}
