import org.testng.annotations.Test;

public class Structuri_Repetitive {


    @Test

    public void metodaTest(){
       //metodaWhile();
      // metodaDoWhile();
       // metodaFor();
        //metodaforEach();
        metodaFor2();
    }

    public void metodaWhile(){

        int i = 1;
        while (i <= 7){
            System.out.println("Counterul este " + i);
        }
    }

    public void metodaDoWhile(){

        int i = 1;

        do{
            System.out.println("Counterul este " + i);
            i++;


        } while (i <= 10);
    }

    public void metodaFor(){

        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
    }
    public void metodaforEach(){

      //  int[] numere ={1,2,3,4};
      //  for(int numar : numere){
       //     System.out.println(numar);
      //  }

        String[] fructe = {"mar", "struguri", "banane"};
        for(String fruct : fructe){
            System.out.println(fruct);
        }
    }

    public void metodaFor2(){

        int i = 2;
        for(;i <= 5;)
        {
            i++;
            System.out.println(i);
        }
    }
}
