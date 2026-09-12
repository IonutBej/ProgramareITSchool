package OOP.Polymorfism;

import org.testng.annotations.Test;

public class PolymorfismTest {


    @Test
    public void metodaTest(){

    //    Angajat angajat = new Angajat("Mitica", "Marcel", 30, 1.76, "HR", "Firma", 4);
     //   angajat.facePrezentariPowerPoint(3);

       // Persoana persoana = new Student("Maria", "Ana", 18, 1.60, "Litere", "B", 2);
       // persoana.lucreaza();

      //  Persoana persoana2 = new Angajat("Mitica", "Marcel", 30, 1.76, "HR", "Firma", 4);
       // persoana2.lucreaza();

        Persoana persoana3 = new Elev("Mitica", "Marcel", 30, 1.76, "note");
                persoana3.lucreaza();
                
    }

}
