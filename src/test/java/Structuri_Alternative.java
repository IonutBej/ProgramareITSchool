import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Structuri_Alternative {

    @Test
    public void metodaTest(){
    // verificareNumar( 8, 5);
       // verficareLitera("a");
      //  verifcareNumarulCinci(5);
         verificareZiSaptamana(3);
    }
    public void verificareNumar(int a, int b ){

        if (a > b)
        {
            System.out.println("Numarul " + a + " este mai mare decat " + b);
        }
        else
        {
            System.out.println("Numarul " + a + " este mai mic decat " + b);
        }
    }

    public void verficareLitera( String litera)
    {
     String name = "Automation";

     if (name.toLowerCase().contains(litera))
     {
         System.out.println(litera + " este in cuvantul Automation");
     }
     else
     {
         System.out.println(litera + " nu este in cuvantul Automation");
     }
    }

    public void verifcareNumarulCinci(int nr) {
        if (nr > 5) {
            System.out.println(nr + " este mai mare decat 5");
        } else if (nr < 5) {
            System.out.println(nr + " este mai mic decat 5");
        } else {
            System.out.println(nr + " este egal decat 5");
        }
    }
        public void verificareZiSaptamana(int zi)
        {
            switch (zi)

         {
             case 1:
                 System.out.println("Luni");
                 break;
             case 2:
                 System.out.println("Marti");
                 break;
             case 3:
                 System.out.println("Miercuri");
                 break;
             case 4:
                 System.out.println("Joi");
                 break;
             case 5:
                 System.out.println("Vineri");
                 break;
             case 6:
                 System.out.println("Sambata");
                 break;
             case 7:
                 System.out.println("Duminica");
                 break;
             default:
                 System.out.println("Numarul nu este o zi a sapatamanii");
         }
    }
}
