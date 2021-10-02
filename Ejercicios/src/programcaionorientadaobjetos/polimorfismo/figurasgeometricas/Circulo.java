package programcaionorientadaobjetos.polimorfismo.figurasgeometricas;

public class Circulo extends Figura {

	private int radio;
	
	public Circulo(int r, String c) {
		super(c);
		radio = r;
	}

	@Override
	public double area() {
		return Math.PI *radio*radio;
	}
	
	public int getRadio() { return radio; }
	
}
