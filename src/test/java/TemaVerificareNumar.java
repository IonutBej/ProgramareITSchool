import org.testng.annotations.Test;

public class TemaVerificareNumar {


    @Test
    public void metodaTest() {
        verificareNumar(0);


    }
    public void verificareNumar(int a){

        if (a % 2 == 0 && a > 0)
        {
            System.out.println("Numarul " + a + " este par si pozitiv");
        }
        else if (a % 2 == 0 && a < 0)
        {
            System.out.println("Numarul " + a + " este par si negativ");
        }
        else if (a % 2 != 0 && a > 0)
        {
            System.out.println("Numarul " + a + " este impar si pozitiv");
        }
        else if (a % 2 != 0 && a < 0)
        {
            System.out.println("Numarul " + a + " este impar si negativ");
        }
        else {
            System.out.println("Numarul " + a + " este par si neutru");
        }
    }
}


