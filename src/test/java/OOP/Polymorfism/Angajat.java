package OOP.Polymorfism;

public class Angajat extends Persoana {

    String departament;
    String firma;
    Integer vechime;


    public Angajat(String nume, String prenume, Integer varsta, Double inaltime, String departament, String firma, Integer vechime) {
        super(nume, prenume, varsta, inaltime);
        this.departament = departament;
        this.firma = firma;
        this.vechime = vechime;

    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Departamentul este " + departament);
        System.out.println("Firma este " + firma);
        System.out.println("Vechimea este " + vechime);


    }
     @Override
    public void lucreaza(){
        System.out.println("Angajatul lucreaza");
    }

    public void facePrezentariPowerPoint(){
        System.out.println("Prezentare1 " + "Prezentare2");


    }
    public String facePrezentariPowerPoint(String rezultat){
        System.out.println("Prezentare1 " + "Prezentare2");
        return "Prezentarea este gata";


    }
    public void facePrezentariPowerPoint(int numar){
        System.out.println("Prezentare " + numar);

    }
    public void facePrezentariPowerPoint(double numar){
        System.out.println("Prezentare " + numar);

    }

    public double facePrezentariPowerPoint(double numar, String titlu){
        System.out.println("Prezentare " + numar + titlu);
        return numar;

    }




    // sa ne gandim structural, e important
    // putem mosteni clasa parinte
    // pentru a face asta, constructorul trebuie sa fie acelasi cu cel de la clasa parinte

}
