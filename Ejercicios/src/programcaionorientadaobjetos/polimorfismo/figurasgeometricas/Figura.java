package programcaionorientadaobjetos.polimorfismo.figurasgeometricas;

public abstract class Figura {
	
	private String color;
	
	public Figura(String c) {
		color = c;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public abstract double area();
	
}
