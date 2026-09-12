package OOP.Polymorfism;

public class Elev extends Persoana {

    String carnet;

    public Elev(String nume, String prenume, Integer varsta, Double inaltime, String carnet) {
        super(nume, prenume, varsta, inaltime);
        this.carnet = carnet;
    }

    public void lucreaza(){
        System.out.println("Elevul deseneaza");
    }

}
