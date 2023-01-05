package Proyecto;

public class Vino extends Articulo implements Alcoholico {
	
	private String color;
	private String origen;
	private int anio;
	private String tipoDeUva;
	private double gradosAlcohol;
	
	//constructores  y con super para que herede lo del padre(artículo)
	
	public Vino() {
		super();
	
	}

	public Vino( String code, String name,
			String mark, int capadidadBotella, double precio, int stock,String color, String origen, int anio, String tipoDeUva, double gradosAlcohol) {
		super(code, name, mark, capadidadBotella, precio, stock);
		this.color=color;
		this.origen=origen;
		this.anio=anio;
		this.tipoDeUva=tipoDeUva;
		this.gradosAlcohol=gradosAlcohol;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return super.toString()+";"+ "Vino [color =" + color+";"+ " origen : "+ origen +";"+ ""
				+ "anio = "+anio +";"+"tipo de uva = "+ tipoDeUva+";"+ "grados de alcohol = "+ gradosAlcohol +"]";
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public void visualizarArticulo() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}

	@Override
	public boolean saludable() {
		boolean saludable = false;
		if(origen.equals("Navarra")) {
			
			saludable = true;
		}
		// TODO Auto-generated method stub
		return saludable;
	}

	@Override
	public double precioTotal() {
		// TODO Auto-generated method stub
		double precioTotal=0.0;
		precioTotal=this.getStock()*this.getPrecio();
		return precioTotal;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String getTipoDeUva() {
		return tipoDeUva;
	}
	
	public void setTipoDeUva(String tipoDeUva) {
		this.tipoDeUva = tipoDeUva;
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
		if(gradosAlcohol>13.5) {
			esFuerte=true;
		}
		return esFuerte;
	}

	@Override
	public double calcularTasa() {
		
		return 0;
	}
	


}
