import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CalcolatriceTest {

    Calcolatrice c = new Calcolatrice();

    @Test
    public void testSomma() {
        Assertions.assertTrue(c.somma(8,2) == 10, "Somma corretta");
    }

    @Test
    public void testMoltiplicazione() {
        Assertions.assertTrue(c.moltiplicazione(8,2) == 16, "Moltiplicazione corretta");
    }

    @Test
    public void testSottrazione() {
        Assertions.assertTrue(c.sottrazione(8,2) == 6, "Sottrazione corretta");
    }

    @Test
    public void testDivisione() {
        Assertions.assertTrue(c.divisione(8,2) == 4, "Divisione corretta");
    }

    @Test
    public void testDivisionePerZero() {
        Assertions.assertTrue(c.divisione(8,0) == 0, "Divisione corretta");
    }

}
