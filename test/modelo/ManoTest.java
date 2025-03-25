package modelo;

import excepciones.NoHayMasCartasException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ManoTest {
    private Mano mano;
    private Mazo mazo;

    @BeforeEach
    void setUp() {
        mano = new Mano();
        mazo = new Mazo();
        mazo.barajar();
    }

    @Test
    void testValorMano() throws NoHayMasCartasException {
        mano.pedirCarta(mazo);
        mano.pedirCarta(mazo);
        assertTrue(mano.valorMano() >= 2 && mano.valorMano() <= 21);
    }

    @Test
    void testFinDeJuego() throws NoHayMasCartasException {
        mano.pedirCarta(mazo);
        mano.pedirCarta(mazo);
        assertTrue(mano.finDeJuego() || mano.valorMano() < 21);
    }
}
