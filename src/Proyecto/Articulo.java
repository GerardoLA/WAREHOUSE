package Proyecto;

public abstract class Articulo {
	
	
	//atributos
	private String code;
	private String name;
	private String mark;
	private int capacidadBotella;
	private double precio;
	private int stock;
	
	//constructores
	
	public Articulo(){}
	
	
	public Articulo(String code, String name, String mark, int capacidadBotella, double precio, int stock) {
		
		this.code = code;
		this.name = name;
		this.mark = mark;
		this.capacidadBotella = capacidadBotella;
		this.precio = precio;
		this.stock = stock;
	}


	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMark() {
		return mark;
	}
	
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	public int getCapacidadBotella() {
		return capacidadBotella;
	}
	
	public void setCapadidadBotella(int capacidadBotella) {
		this.capacidadBotella = capacidadBotella;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	@Override
	public String toString() {
		return "Articulo [code=" + code + ";"+ " name=" + name + ";" + " mark=" + mark + ";"
	+ " capadidadBotella=" + capacidadBotella+ ";" + " precio=" + precio + ";" +
		" stock=" + stock + "]";
	}
	
	public void  incrementarStock(int cantidad) {
		this.stock = this.stock + cantidad;
	}
	
	public void disminuirStock(int cantidad) {
		if(this.stock<cantidad || this.stock==0) {
			System.out.println("No hay existencias");
		}else {
		this.stock = this.stock - cantidad;
		}
	}
	
	
	public abstract void visualizarArticulo();
	
	public abstract boolean saludable();
	
	public abstract double precioTotal();
	
	
}
