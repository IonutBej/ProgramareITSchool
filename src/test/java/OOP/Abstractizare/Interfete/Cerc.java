package OOP.Abstractizare.Interfete;


public class Cerc implements IFormeGeometrice, IHartie {

    private int raza;


    @Override
    public void calculeazaAria() {

        System.out.println("Aria cercului este " + Math.PI * (Math.pow(raza,2)));

    }

    @Override
    public void deseneaza() {
        System.out.println("Se deseneaza cercul");
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public void tipHartie() {
        System.out.println("Se deseneaza pe A3");
    }
}
