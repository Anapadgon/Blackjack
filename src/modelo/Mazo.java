package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modelo.Carta.Palo;
import excepciones.NoHayMasCartasException;

/**
 * Representa un mazo de cartas para el juego de Blackjack.
 *
 * @author Ana Padilla González
 * @version 1.0
 */
public class Mazo {

	/**
	 * Lista de cartas en el mazo.
	 */
	protected List<Carta> cartas;

	/**
	 * Constructor de la clase Mazo, inicializa un mazo con todas las cartas.
	 */
	public Mazo() {
		this.cartas = new ArrayList<>();
		for (Palo palo : Palo.values()) {
			for (int i = 1; i <= 13; i++) {
				Carta carta = new Carta(i, palo);
				this.cartas.add(carta);
			}
		}
	}

	/**
	 * Baraja el mazo de cartas aleatoriamente.
	 */
	public void barajar() {
		Collections.shuffle(cartas);
	}

	/**
	 * Representación en cadena del mazo.
	 *
	 * @return Una lista de todas las cartas en el mazo.
	 */
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		for (Carta carta : cartas) {
			res.append(carta.toString()).append("\n");
		}
		return res.toString();
	}

	/**
	 * Extrae una carta del mazo.
	 *
	 * @return La carta extraída del mazo.
	 * @throws NoHayMasCartasException Si no hay más cartas en el mazo.
	 */
	public Carta solicitarCarta() throws NoHayMasCartasException {
		if (this.cartas.isEmpty()) {
			throw new NoHayMasCartasException();
		}
		Carta carta = this.cartas.get(0);
		this.cartas.remove(0);
		return carta;
	}
}
