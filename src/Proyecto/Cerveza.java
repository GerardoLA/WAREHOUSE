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
		if(this.gradosAlcohol > 7) {
			esFuerte=true;
		}
		return esFuerte;
	}

	@Override
	public double calcularTasa() {
		double tasa;
		if(this.esFuerte()) {
			tasa=this.getCapacidadBotella()*TASA_BEBIDAS_FUERTES/10000;
			
		}else
			tasa=this.getCapacidadBotella()*TASA_BEBIDAS_SUAVES/10000;
	
		return tasa;
	}

	@Override
	public void visualizarArticulo() {
		System.out.println(this.toString());
		
	}
	
	@Override
	public boolean saludable() {
		boolean saludable = false;
		if(this.cereales.equals("lupulo")) {
			saludable= true;
		}
		return saludable;
	}

	@Override
	public void precioTotal() {
		double precioTotal=0.0;
		precioTotal= this.getPrecio()+this.getPrecio()*0.21+calcularTasa();
		System.out.println("El precio+iva+tasa de bebidas: "+ precioTotal);
		
		
		
	}
	
	
}
