
public class Electrodomestico {
	int precio_base = 100;
	String color = "blanco";
	char c_energetico = 'F';
	double peso = 5.0;

	public Electrodomestico() {
		
	}
	public Electrodomestico(int precio_base, String color, char c_energetico, double peso) {
		super();
		this.precio_base = precio_base;
		this.color = color;
		this.c_energetico = c_energetico;
		this.peso = peso;
	}

	public Electrodomestico(int precio_base, double peso) {
		super();
		this.precio_base = precio_base;
		this.peso = peso;
	}
}
