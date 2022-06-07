package colection;

public class Carta {

	public static enum Cara { As, Dos, Tres, Cuatro, Cinco, Seis, Siete, Ocho, Nueve, Diez, Joto, Quina, Rey };
	
	public static enum Palo { Bastones, Diamantes, Corazones, Espadas };
	
	private final Cara cara;
	private final Palo palo;
	
	//constructor con dos argumentos
	public Carta( Cara caraCarta, Palo paloCarta ) {
		cara = caraCarta;
		palo = paloCarta;
	}//fin del constructor de Carta con dos argumentos
	
	//devuelve la cara de la carta
	public Cara obtenerCara(  ) {
		return cara;
	}
	
	public Palo obtenerPalo() {
		return palo;
	}
	
	public String toString() {
		return String.format("%s de %s", cara, palo );
	}
	
}