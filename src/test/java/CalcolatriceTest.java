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
        Assertions.assertTrue(c.somma(2,2) == 4, "Moltiplicazione corretta");
    }
}
