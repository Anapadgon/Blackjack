package modelo;

import java.util.ArrayList;
import java.util.List;
import excepciones.NoHayMasCartasException;

/**
 * Representa una mano de cartas en el juego de Blackjack.
 *
 * @author Ana Padilla González
 * @version 1.0
 */
public class Mano extends Mazo {

	/**
	 * Constructor de la clase Mano, inicializa una mano vacía.
	 */
	public Mano() {
		this.cartas = new ArrayList<Carta>();
	}

	/**
	 * Calcula el valor total de la mano.
	 *
	 * @return La suma del valor de todas las cartas en la mano.
	 */
	public int valorMano() {
		int valor = 0;
		for (Carta carta : this.cartas) {
			valor += carta.getValor();
		}
		return valor;
	}

	/**
	 * Determina si el juego ha finalizado.
	 *
	 * @return {@code true} si el valor de la mano es mayor o igual a 21, de lo contrario {@code false}.
	 */
	public boolean finDeJuego() {
		return this.valorMano() >= 21;
	}

	/**
	 * Representación en cadena de la mano actual.
	 *
	 * @return Una cadena que muestra el valor total de la mano y las cartas que la componen.
	 */
	@Override
	public String toString() {
		return "Valor de la Mano: " + this.valorMano() + "\n" + super.toString();
	}

	/**
	 * Agrega una carta a la mano desde el mazo.
	 *
	 * @param m El mazo del que se solicita la carta.
	 * @throws NoHayMasCartasException Si el mazo no tiene más cartas.
	 */
	public void pedirCarta(Mazo m) throws NoHayMasCartasException {
		Carta c = m.solicitarCarta();
		this.cartas.add(c);
	}
}

