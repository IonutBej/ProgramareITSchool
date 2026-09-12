import org.testng.annotations.Test;

public class MetodaReturn {

    @Test
    public void metodaTest() {
        System.out.println(getSalariu());
        System.out.println(getNume());
        System.out.println(rezultatCalcul());
    }

    public Integer getSalariu() {
        Integer salariu = 25000;
        return salariu;
    }

    public String getNume() {
        String nume = "Ionut";
        return nume;
    }

    public double rezultatCalcul() {
        double rezultat = Math.cos(Math.toRadians(35.4));
        return rezultat;
    }
}