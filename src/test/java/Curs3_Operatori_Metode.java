import org.testng.annotations.Test;

public class Curs3_Operatori_Metode{

    @Test
    public void metodaTest(){
        // adunareDouaNumere(2, 5);
        // notaExamen("Oancea", "Bianca", 8.5);
        // impartireExactaLa2(4, 13);
        // esteAdevarat();
        // incrementare(5);
           comparatie(5,6);
    }
    /*public void adunareDouaNumere()
    {
        int x = 2;
        int y = 5;
        int suma = x + y;
        System.out.println("Rezultatul adunarii este = " + suma);
        System.out.println("Rezultatul adunarii este = " + (x+y));
    }*/

   /* public void adunareDouaNumere(int x, int y)
    {
        System.out.println("Rezultatul adunarii este = " + (x+y));
    }*/
    public  void notaExamen(String nume, String prenume, double nota){

        System.out.println( nume +" " + prenume + " are nota la examen " + nota);
    }

    public void impartireExactaLa2(int a, int b){
        int rezultat = a % 2;
        int rezultat2 = b % 2;
        System.out.println(rezultat);
        System.out.println(rezultat2);
    }
    public void esteAdevarat(){
        boolean x = true;
        System.out.println(x);
        System.out.println(!x);
    }

    public void incrementare(int x){
       int rezultat = x++;
       int rezultat2 = ++x;
        System.out.println(rezultat);
        System.out.println(rezultat2);
    }
    public void comparatie(int x, int y){
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x!=y);
    }

}

