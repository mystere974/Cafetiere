import org.epsi.cafetiere.Cafe;
import org.epsi.cafetiere.Cafetiere;
import org.epsi.cafetiere.Tasse;
import org.epsi.cafetiere.TypeCafe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TasseTest {

    @Test
    public void testTailleTasse(){
        Tasse tasse = new Tasse(100);

        assertEquals(tasse.getQuantiteCafeMax(), tasse.getEspaceDisponible());

    }

    @Test
    public void testAjoutCafe() {
        Tasse tasse = new Tasse();
        Cafetiere cafetiere = new Cafetiere();
        cafetiere.remplirTasse(tasse, TypeCafe.JAVA, tasse.getQuantiteCafeMax());

        assertEquals(tasse.getQuantiteCafeMax(), tasse.getCafe().getQuantiteLiquideMl());
    }

    @Test
    public void testTasseVide() {
        Tasse tasse = new Tasse();
        Cafetiere cafetiere = new Cafetiere();
        cafetiere.remplirTasse(tasse);
        tasse.boire();

        assertEquals(0,tasse.getCafe().getQuantiteLiquideMl());

    }

    @Test
    public void testAjoutCafe2() {
        Tasse tasse = new Tasse(100);
        Cafetiere cafetiere = new Cafetiere();
        cafetiere.remplirTasse(tasse, TypeCafe.JAVA,tasse.boire(50));
    }
}
