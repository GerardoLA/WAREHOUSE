package Proyecto;

public class Cerveza extends Articulo implements Alcoholico{

	

	private String origen;
	private String cereales;
	private double gradosAlcohol;
	
	public Cerveza () {}
	
	public Cerveza( String code, String name, String mark, int capacidadBotella,
			double precio, int stock,String origen, String cereales, double gradosAlcohol) {
		super(code, name, mark, capacidadBotella, precio, stock);
		this.origen = origen;
		this.cereales = cereales;
		this.gradosAlcohol = gradosAlcohol;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+";"+" Origen= "+ origen + ";"+ "Cereales = "+ cereales + ";"+
				" grados de alcohol = "+gradosAlcohol;
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
		boolean esFuerte = false;
		if(gradosAlcohol > 7) {
			esFuerte=true;
		}
		return esFuerte;
	}

	@Override
	public double calcularTasa() {
	
		return 0;
	}

	@Override
	public void visualizarArticulo() {
		System.out.println(this.toString());
		
	}
	//el enunciado no dice cuando una cerveza es saludable...pero..
	@Override
	public boolean saludable() {
		boolean saludable = false;
		if(this.origen.equals("Belgica")) {
			saludable= true;
		}
		return saludable;
	}

	@Override
	public double precioTotal() {
		double precioTotal=0.0;
		precioTotal= this.getPrecio()*this.getStock();
		
		
		return precioTotal;
	}
	
	
}
