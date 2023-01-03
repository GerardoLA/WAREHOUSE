package Proyecto;

public class Refresco extends Articulo {
	private String sabor;
	private String zumo;
	private boolean gaseoso;
	private int cantidadAzucar;
	
	
	public Refresco() {
		super();
	}


	public Refresco(String sabor, String zumo, boolean gaseoso, int cantidadAzucar,String code, String name,
			String mark, int capacidadBotella, double precio, int stock) {
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
	
	//DUDA: string toString con super??
	@Override
	public String toString() {
		return super.toString() + "Refresco [sabor=" + sabor + ", zumo=" + zumo + ", gaseoso=" + gaseoso + ", cantidadAzucar="
				+ cantidadAzucar + "]";
	}
	
	
	
	
	public void visualizarPropiedades() {
		System.out.println("sabor :" + this.sabor + "; zumo : "+ this.zumo + "Gaseoso : "+ this.gaseoso + "; cantidadAzucar: "+ this.cantidadAzucar);
	}
	
	public boolean esSaludable() {
		boolean esSaludable = false;
		if (cantidadAzucar<20) {
			esSaludable = true;	
		}
		return esSaludable;
	}


	
}
