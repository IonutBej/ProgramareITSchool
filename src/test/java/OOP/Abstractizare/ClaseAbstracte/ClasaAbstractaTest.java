package OOP.Abstractizare.ClaseAbstracte;

import org.testng.annotations.Test;

public class ClasaAbstractaTest {

    @Test
    public void metodaTest(){
        Cerc cerc = new Cerc();
        cerc.setRaza(2);
        cerc.calculeazaAria();
        cerc.deseneaza();
    }
    @Test
    public void metodaTestDoi(){
        Patrat patrat = new Patrat();
        patrat.setLatura(5);
        patrat.calculeazaAria();
        patrat.deseneaza();
    }
    }
    }