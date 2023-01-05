package Proyecto;

public class Refresco extends Articulo {
	private String sabor;
	private String zumo;
	private boolean gaseoso;
	private int cantidadAzucar;
	
	
	public Refresco() {
		super();
	}


	public Refresco(String code, String name,String mark, int capacidadBotella, double precio, int stock,String sabor, String zumo, boolean gaseoso, int cantidadAzucar) {
		super(code, name, mark, capacidadBotella, precio, stock);
		
		this.sabor = sabor;
		this.zumo = zumo;
		this.gaseoso = gaseoso;
		this.cantidadAzucar = cantidadAzucar;
	}

	



	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public String getZumo() {
		return zumo;
	}
	
	public void setZumo(String zumo) {
		this.zumo = zumo;
	}
	
	public boolean isGaseoso() {
		return gaseoso;
	}
	
	public void setGaseoso(boolean gaseoso) {
		this.gaseoso = gaseoso;
	}
	
	public int getCantidadAzucar() {
		return cantidadAzucar;
	}
	
	public void setCantidadAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}
	
	
	@Override
	public String toString() {
		return super.toString() +";"+ "Refresco [sabor=" + sabor +";"+ " zumo=" + zumo +";"+
	" gaseoso=" + gaseoso +";"+ " cantidadAzucar="+ cantidadAzucar + "]";
	}
	
	
	
	
	public void visualizarPropiedades() {
		System.out.println("sabor :" + this.sabor + "; zumo : "+ this.zumo + "Gaseoso : "+ this.gaseoso + "; cantidadAzucar: "+ this.cantidadAzucar);
	}
	
	// he hecho este metodo distinto aunque podia haber sobreescrito el metodo heredado saludable de articulo
	public boolean esSaludable() {
		boolean esSaludable = false;
		if (cantidadAzucar<20) {
			esSaludable = true;	
		}
		return esSaludable;
	}


	@Override
	public void visualizarArticulo() {
		System.out.println(this.toString());
		
	}


	@Override
	public boolean saludable() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public double precioTotal() {
		double precioTotal=0.0;
		precioTotal=this.getStock()*this.getPrecio();
		return precioTotal;
	}


	
}
