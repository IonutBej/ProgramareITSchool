package OOP.Abstractizare.ClaseAbstracte;

import OOP.Abstractizare.Interfete.IFormeGeometrice;
import OOP.Abstractizare.Interfete.IHartie;

public class Patrat extends FormeGeometrice {

    private int latura;


    public int getLatura(){
        return latura;
    }
    public void setLatura(int latura){
        this.latura = latura;
    }

    @Override
    public void calculeazaAria() {
        System.out.println("Aria patratului este " + Math.PI * (Math.pow(latura,2)));
    }
}
