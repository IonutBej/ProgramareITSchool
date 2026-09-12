package OOP.ObiectConstructor;

public class Masina {

    String marca;
    String model;
    int numarRoti;
    String clasa;
    double capacitateCilindrica;
    Boolean esteAutoutilitara;
    static double pret = 100000.30;

    public Masina(String marca, String model, int numarRoti, String clasa, double capacitateCilindrica) {
        this.marca = marca;
        this.model = model;
        this.numarRoti = numarRoti;
        this.clasa = clasa;
        this.capacitateCilindrica = capacitateCilindrica;

    }

    public Masina(String marca){
        this.marca = marca;
    }

    public Masina(){

    }

    public Masina(String marca, String model, int numarRoti, String clasa, double capacitateCilindrica, boolean esteAutoutilitara) {
        this.marca = marca;
        this.model = model;
        this.numarRoti = numarRoti;
        this.clasa = clasa;
        this.capacitateCilindrica = capacitateCilindrica;
        this.esteAutoutilitara = esteAutoutilitara;
    }

    public void afisareSpecificatii(){

        System.out.println("Marca este " + marca);
        System.out.println("Modelul este " + model);
        System.out.println("Numarul rotilor este " + numarRoti);
        System.out.println("Clasa este " + clasa);
        System.out.println("Capacitatea cilindrica este " + capacitateCilindrica);

        if (esteAutoutilitara != null){

            System.out.println("Masina este autoutilitara " + esteAutoutilitara);


        }
        System.out.println();
    }
}
