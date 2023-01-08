package Proyecto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import clases.LineaFactura;

public class Factura {
	
	
	public final static int IVA = 21;
	private int numero;
	private String nombreEmpresa;
	private Date fecha;
	private String concepto;
	private ArrayList<LineaFactura>lineas;
	
	
	
	
	public Factura(int numero, String nombreEmpresa, Date fecha, String concepto, ArrayList<LineaFactura> lineas) {
		
		this.numero = numero;
		this.nombreEmpresa = nombreEmpresa;
		this.fecha = fecha;
		this.concepto = concepto;
		this.lineas = new ArrayList<LineaFactura>();
	}

	//faltan metodos precioTotal y guardarenFichero

	public void mostrarEnPantalla() {
		System.out.println("Numero de Factura:" + this.numero +"Nombre de empresa : "+
	this.nombreEmpresa + "fecha : "+ new SimpleDateFormat("dd/MM/yyyy").format(this.fecha) + "Concepto : "+
				this.concepto);
	}
	
	
	public void eliminarLinea(int numeroLinea) {
		Scanner scan=new Scanner(System.in);
		lineas.remove(numeroLinea);
	}
	
	public void addLinea(LineaFactura linea) {
		lineas.add(linea);
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	public ArrayList<LineaFactura> getLineas() {
		return lineas;
	}
	
	public void setLineas(ArrayList<LineaFactura> linea) {
		this.lineas = linea;
	}
	
	@Override
	public String toString() {
		
		return "Factura: numero= " + numero + "Nombre de la empresa = " + nombreEmpresa + "Fecha : "+ fecha
				+ "Concepto : " + concepto + "Linea : " + lineas;
	}
	
	/* modelo de otro ejercicio...
	 * public void mostrarEnPantalla() {
	System.out.println("Numero factura: " + this.numero + "\t\t" + this.nombreEmpresa);
	System.out.println("Fecha: " + new SimpleDateFormat("dd/MM/yyyy").format(this.fecha));
	System.out.println(this.concepto);
	
	System.out.println("num\tart.\tprecio\tcant.\ttotal");
	System.out.println("---\t----\t-------\t-----\t-----");
	for(LineaFactura lineaFactura : this.lineas) {
		lineaFactura.mostrarEnPantalla();
	}
System.out.println("\t\t\t---Total: " + this.precioTotal());

}*/

}
