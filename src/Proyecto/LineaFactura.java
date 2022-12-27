package Proyecto;

public class LineaFactura {
private int numero;
private String articulo;
private int cantidad;

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public String getArticulo() {
	return articulo;
}

public void setArticulo(String articulo) {
	this.articulo = articulo;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public double precioTotal() {
	return precio*cantidad;
	/*precio heredado de articulo cuando se haga?? */
}
}
