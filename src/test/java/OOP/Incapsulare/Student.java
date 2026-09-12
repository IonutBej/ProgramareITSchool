package OOP.Incapsulare;

public class Student extends Persoana {

    private String facultate;
    private String grupa;
    private Integer restante;


    public Student(String nume, String prenume, Integer varsta, Double inaltime, String facultate, String grupa, Integer restante) {
        super(nume, prenume, varsta, inaltime);
        this.facultate = facultate;
        this.grupa = grupa;
        this.restante = restante;

    }
    protected void infoStudent(){

        infoPersoana();
        System.out.println("Facultatea este " + facultate);
        System.out.println("Grupa este " + grupa);
        System.out.println("Numarul de restante este " + restante);

}

    public void lucreaza(){
        System.out.println("Studentul lucreaza");

    }

    public String getFacultate() {
        return facultate;
    }

    public String getGrupa() {
        return grupa;
    }

    public Integer getRestante() {
        return restante;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public void setRestante(Integer restante) {
        this.restante = restante;
    }
}
// sa facem corelatii si sa dam exemple practice, nu teoretice neaparat