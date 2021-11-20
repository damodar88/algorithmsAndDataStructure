package programcaionorientadaobjetos.polimorfismo.figurasgeometricas;

public class Main {

	public static void main(String[] args) {
		Figura f = new Triangulo(0, 0, null);
		f.area();
		f.getColor();
		
		f = new Circulo(0, null);
		f.area();
		f.getColor();
		
		mostrar(new Triangulo(5,7,"verde"));
		mostrar(new Circulo(4,"azul"));
	}

	public static void mostrar(Figura f) {
		System.out.println("El color de la figuro es "+ f.getColor() + " ");
		System.out.println("El are de la figura es "+ f.area() + " ");
	}

}
