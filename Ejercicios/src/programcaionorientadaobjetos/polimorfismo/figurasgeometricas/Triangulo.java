package programcaionorientadaobjetos.polimorfismo.figurasgeometricas;

public class Triangulo extends Figura {

	private int base;
	private int altura;
	
	public Triangulo(int b, int a, String c) {
		super(c);
		base=b;
		altura=a;
	}

	@Override
	public double area() {
		return base*altura/2;
	}
	
	public int getBase(){return base;}
	public int getAltura(){return altura;}
}
