package Proyecto;

public class Articulo {
	//atributos
	private String code;
	private String name;
	private String mark;
	private int capadidadBotella;
	private double precio;
	private int stock;
	
	//constructores
	
	public Articulo(){}
	
	
	public Articulo(String code, String name, String mark, int capadidadBotella, double precio, int stock) {
		super();
		this.code = code;
		this.name = name;
		this.mark = mark;
		this.capadidadBotella = capadidadBotella;
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
	
	public int getCapadidadBotella() {
		return capadidadBotella;
	}
	
	public void setCapadidadBotella(int capadidadBotella) {
		this.capadidadBotella = capadidadBotella;
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
	

}
