package Proyecto;

public class Cerveza extends Articulo implements Alcoholico{

	

	private String origen;
	private String cereales;
	private double gradosAlcohol;
	
	public Cerveza () {}
	
	public Cerveza(String origen, String cereales, double gradosAlcohol) {
		super();
		this.origen = origen;
		this.cereales = cereales;
		this.gradosAlcohol = gradosAlcohol;
	}
	
	
	
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String getCereales() {
		return cereales;
	}
	
	public void setCereales(String cereales) {
		this.cereales = cereales;
	}
	
	public double getGradosAlcohol() {
		return gradosAlcohol;
	}
	
	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}

	
	@Override
	public boolean esFuerte() {
		
		return false;
	}

	@Override
	public double calcularTasa() {
	
		return 0;
	}
	
}
