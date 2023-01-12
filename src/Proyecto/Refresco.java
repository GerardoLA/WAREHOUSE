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
	


	@Override
	public void visualizarArticulo() {
		System.out.println(this.toString());
		
	}


	@Override
	public boolean saludable() {
		boolean saludable = false;
		if(this.cantidadAzucar<20) {
			saludable=true;
		}
		return saludable;
	}


	@Override
	public void precioTotal() {
		double precioTotal=0.0;
		precioTotal=this.getPrecio()+this.getPrecio()*0.21;
		System.out.println("el precio total iva incluido es :"+ precioTotal);
		
	}


	
}
