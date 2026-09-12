package OOP.Abstractizare.ClaseAbstracte;


import OOP.Abstractizare.Interfete.IFormeGeometrice;
import OOP.Abstractizare.Interfete.IHartie;

public class Cerc extends FormeGeometrice {

    private int raza;

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public void calculeazaAria() {
        System.out.println("Aria cercului este " + Math.PI * (Math.pow(raza,2)));

    }
}


