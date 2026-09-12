package OOP.Mostenire;

public class Student extends Persoana {

    String facultate;
    String grupa;
    Integer restante;


    public Student(String nume, String prenume, Integer varsta, Double inaltime, String facultate, String grupa, Integer restante) {
        super(nume, prenume, varsta, inaltime);
        this.facultate = facultate;
        this.grupa = grupa;
        this.restante = restante;

    }
    public void infoStudent(){

        infoPersoana();
        System.out.println("Facultatea este " + facultate);
        System.out.println("Grupa este " + grupa);
        System.out.println("Numarul de restante este " + restante);

}
    public void lucreaza(){
        System.out.println("Studentul lucreaza");

    }
}
// sa facem corelatii si sa dam exemple practice, nu teoretice neaparata