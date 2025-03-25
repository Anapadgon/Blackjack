package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartaTest {

    @Test
    void testGetNumero() {
        Carta carta = new Carta(5, Carta.Palo.CORAZONES);
        assertEquals(5, carta.getNumero());
    }

    @Test
    void testGetPalo() {
        Carta carta = new Carta(7, Carta.Palo.TREBOL);
        assertEquals(Carta.Palo.TREBOL, carta.getPalo());
    }

    @Test
    void testGetValor() {
        Carta cartaAs = new Carta(1, Carta.Palo.PICAS);
        assertEquals(11, cartaAs.getValor());

        Carta cartaRey = new Carta(13, Carta.Palo.DIAMANTE);
        assertEquals(10, cartaRey.getValor());

        Carta cartaNormal = new Carta(8, Carta.Palo.CORAZONES);
        assertEquals(8, cartaNormal.getValor());
    }
}
