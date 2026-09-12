package OOP.Abstractizare.Interfete;
import OOP.Abstractizare.ClaseAbstracte.Cerc;
import OOP.Abstractizare.ClaseAbstracte.Patrat;
import org.testng.annotations.Test;

public class AbstractizareTest {

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
        patrat.setLatura(10);
        patrat.calculeazaAria();
        patrat.deseneaza();
    }
}
