package Proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	
	final String NOMBRE_FICHERO = "datos/bebidas.txt"; //ojo comprobar dirección bien
	
	ArrayList<Articulo>articulos=new ArrayList<>();
	
	public void cargarDatos() throws FileNotFoundException {
		File file = new File("NOMBRE_FICHERO");
		Scanner scan = new Scanner (file);
		
		while(scan.hasNextLine()) {
			String linea[]= scan.nextLine().split(";");
			if(linea[1].charAt(0)=='1') {
				Refresco refresco = new Refresco(linea[0], linea[1],linea[2], Integer.parseInt(linea[3]),
						Double.parseDouble(linea[4]),Integer.parseInt(linea[5]),linea[6],linea[7],
						Boolean.parseBoolean(linea[8]),Integer.parseInt(linea[9]));
				
				articulos.add(refresco);
			}
			
			if (linea[1].charAt(0)=='2') {
				Vino vino = new Vino(linea[0],linea[1],linea[2],Integer.parseInt(linea[3]),Double.parseDouble(linea[4]),
						Integer.parseInt(linea[5]),linea[6],linea[7],Integer.parseInt(linea[8]),linea[9],Double.parseDouble(linea[10]));
				
				articulos.add(vino);
			}
			
			if (linea[1].charAt(0)=='3') {
				Cerveza cerveza = new Cerveza(linea[0],linea[1],linea[2],Integer.parseInt(linea[3]),Double.parseDouble(linea[4]),
						Integer.parseInt(linea[5]),linea[6],linea[7],Double.parseDouble(linea[8]));
				
				articulos.add(cerveza);
			}
		}
	}
	
		public Articulo elMasCaro() {
			double precio = 0;
			Articulo articulo = null;
			for (Articulo elMas : articulos) {
				if (precio < elMas.getPrecio()) {
					precio = elMas.getPrecio();
				}
				
			}
			return articulo;
		}
		
		public double precio(String code) {
			for (Articulo articulo : articulos) {
				if (code.equals(articulo.getCode())) {
					return articulo.getPrecio();
				}
			}
			return 0;
		}
		
		public boolean hayStock(String codigoProducto) {
			for (Articulo articulo : articulos) {
				if(codigoProducto.equals(articulo.getCode()) && articulo.getStock()>0) {
					return true;	
				}	
			}
		return false;
		
		}
		
		public ArrayList<Articulo> stockJusto(int sotck){
			ArrayList<Articulo> articulosStockJusto = new ArrayList<Articulo>();
			
			for (Articulo articulo : articulos) {
				if(articulo.getStock() ==stock)	{
					stockjusto.
				}
			}
			
		}
	
	}
	


