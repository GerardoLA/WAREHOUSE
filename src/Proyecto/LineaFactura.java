package Proyecto;


public class LineaFactura {


private int numero;
private  Articulo articulo;
private int cantidad;

public LineaFactura() {}

public LineaFactura(int numero, Articulo articulo, int cantidad) {
	
	this.numero = numero;
	this.articulo = articulo;
	this.cantidad = cantidad;
}



public int getNumero() {
	return numero;
}



public void setNumero(int numero) {
	this.numero = numero;
}



public Articulo getArticulo() {
	return articulo;
}



public void setArticulo(Articulo articulo) {
	this.articulo = articulo;
}



public int getCantidad() {
	return cantidad;
}



public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public double precioTotal() {
	double precioTotal=0.0;
	precioTotal= cantidad*articulo.getPrecio();
	return precioTotal;
	
}

public void mostrarEnPantalla() {
	System.out.println(
			this.numero+ "\t" + 	
			this.articulo + "\t" + 
			this.cantidad + "\t" +
			this.precioTotal()
			);
}

@Override
public String toString() {
	
	return "LineaFactura; numero : "+numero + "Artículo = " + articulo + "CAntidad = " + cantidad ;

	


	}

}

