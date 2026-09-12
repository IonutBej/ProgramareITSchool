package OOP.ObiectConstructor;

import org.testng.annotations.Test;

public class ClasaTeste {

    @Test
    public void metodaTest(){

       // Masina masina1 = new Masina("BMW", "Seria 5", 4, "Coupe", 2.0);
     //  masina1.afisareSpecificatii();

        System.out.println(Masina.pret);
        System.out.println(Math.pow(30,20)); // 30 la puterea 20 metoda Math.pow este statica

        // metodele statice nu le instantiem in clasa


     /*   Masina masina2 = new Masina("Dacia","Duster", 4, "SUV", 2.5);
        masina2.afisareSpecificatii();
       // System.out.println(masina1.model);
        // System.out.println(masina2.clasa);

        Masina masina3 = new Masina("AUDI");
        masina3.afisareSpecificatii();

        Masina masina4 = new Masina("Volvo", "V40", 4, "Hashback", 1.8, false);
        masina4.afisareSpecificatii();

     */



    }
}
