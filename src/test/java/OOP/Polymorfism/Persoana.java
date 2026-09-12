package OOP.Polymorfism;

public class Persoana {

    String nume;
    String prenume;
    Integer varsta;
    Double inaltime;

    // constuctorul are acelasi nume cu clasa


    public Persoana(String nume, String prenume, Integer varsta, Double inaltime) {

        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.inaltime = inaltime;

    }

    public void infoPersoana(){

        System.out.println("Numele este " + nume);
        System.out.println("Prenumele este " + prenume);
        System.out.println("Varsta este " + varsta);
        System.out.println("Inaltimea este " + inaltime);



    }

    public void lucreaza(){
        System.out.println("Persoana  " + inaltime);

    }
}
