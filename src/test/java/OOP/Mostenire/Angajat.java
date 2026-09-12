package OOP.Mostenire;

import java.sql.SQLOutput;

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

    // sa ne gandim structural, e important
    // putem mosteni clasa parinte
    // pentru a face asta, constructorul trebuie sa fie acelasi cu cel de la clasa parinte

}
