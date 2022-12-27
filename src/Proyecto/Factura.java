package Proyecto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Factura {
	
	private int numero;
	private String nombreEmpresa;
	private Date fecha;
	private String concepto;
	private ArrayList<LineaFactura>lineas=new ArrayList<LineaFactura>();
	
	
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
	
	public void setLineas(ArrayList<LineaFactura> lineas) {
		this.lineas = lineas;
	}

}
