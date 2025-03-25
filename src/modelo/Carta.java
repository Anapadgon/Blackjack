package modelo;

/**
 * Representa una carta de una baraja estándar con palo y valor.
 *
 * @author Ana Padilla González
 * @version 1.0
 */
public class Carta {

	public enum Palo {
		TREBOL, DIAMANTE, CORAZONES, PICAS
	}

	private int numero;
	private Palo palo;

	/**
	 * Constructor de la clase Carta.
	 *
	 * @param numero El valor numérico de la carta.
	 * @param palo   El palo de la carta (corazones, diamantes, tréboles, picas).
	 */
	public Carta(int numero, Palo palo) {
		if (numero >= 1 && numero <= 13) {
			this.numero = numero;
			this.palo = palo;
		}
	}

	/**
	 * Obtiene el número de la carta.
	 *
	 * @return El valor numérico de la carta.
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Obtiene el palo de la carta.
	 *
	 * @return El palo de la carta.
	 */
	public Palo getPalo() {
		return palo;
	}

	/**
	 * Obtiene el valor de la carta según las reglas de Blackjack.
	 *
	 * @return El valor numérico de la carta.
	 */
	public int getValor() {
		if (this.numero >= 2 && this.numero <= 10) {
			return this.numero;
		} else if (this.numero == 1) {
			return 11;
		} else {
			return 10;
		}
	}

	/**
	 * Muestra el número de la carta en un formato legible.
	 *
	 * @return Representación en string del número de la carta.
	 */
	public String mostrarNumero() {
		switch (this.numero) {
			case 1:
				return "AS";
			case 11:
				return "J";
			case 12:
				return "Q";
			case 13:
				return "K";
			default:
				return String.valueOf(this.numero);
		}
	}

	/**
	 * Representación en cadena de la carta.
	 *
	 * @return Número y palo de la carta.
	 */
	@Override
	public String toString() {
		return "[" + mostrarNumero() + " - " + palo + "]";
	}
}

