package OOP.Abstractizare.Interfete;

public class Patrat implements IFormeGeometrice, IHartie {

    private int latura;


    @Override
    public void calculeazaAria(){

        System.out.println("Aria patratului este " + Math.pow(latura,2));
    }

    @Override
    public void deseneaza() {
        System.out.println("Se deseneaza patratul");
    }

    public int getLatura(){
        return latura;
    }
    public void setLatura(int latura){
        this.latura = latura;
    }

    @Override
    public void tipHartie() {
        System.out.println("Se deseneaza pe A4");
    }
}
