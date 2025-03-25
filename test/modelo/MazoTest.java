package modelo;

import excepciones.NoHayMasCartasException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MazoTest {
    private Mazo mazo;

    @BeforeEach
    void setUp() {
        mazo = new Mazo();
        mazo.barajar();
    }

    @Test
    void testSacarCarta() throws NoHayMasCartasException {
        Carta carta = mazo.solicitarCarta();
        assertNotNull(carta);
    }

    @Test
    void testBarajar() {
        Mazo mazoNuevo = new Mazo();
        mazoNuevo.barajar();
        assertNotEquals(mazo.toString(), mazoNuevo.toString());
    }
}
