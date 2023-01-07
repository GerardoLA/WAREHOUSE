package Proyecto;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorAlmacenApp {
	
	//menu de los casos de uso
	
	private final static int REALIZAR_VENTA =1; // include MostrarFactura; extend GuardarFacturaEnFichero
	private final static int REALIZAR_COMPRA = 2;
	private final static int VER_ARTICULOS_SALUDABLES = 3;
	private final static int VER_EL_ARTICULO_MAS_CARO = 4;
	private final static int VER_ARTICULOS_CON_MENOS_STOCK_QUE_X =5;
	private final static int SALIR = 0;
	
	Scanner scan = new Scanner(System.in);
	// final String NOMBRE_FICHERO = "datos/bebidas.txt";
	  public void run() throws FileNotFoundException {
		  Almacen articulosAlmacen=new Almacen();
		  articulosAlmacen.cargarDatos();
		  
		  int opcion;
		  
		  do {
			  opcion= Integer.parseInt(scan.nextLine());
			  
			  System.out.println("    MENU     ");
			  System.out.println(REALIZAR_VENTA +".-Realizar venta");
			  System.out.println(REALIZAR_COMPRA +".-Realizar compra");
			  System.out.println(VER_ARTICULOS_SALUDABLES+".-Ver articulos saludables");
			  System.out.println(VER_EL_ARTICULO_MAS_CARO+".- El artículo más caro es...");
			  System.out.println(VER_ARTICULOS_CON_MENOS_STOCK_QUE_X+".-Saber qué articulos tienen menos"
			  		+ "stock de...la cantidad que digas");
			  System.out.println(SALIR+"Agur Benhur");
			  
			  System.out.println("MARQUE EL NÚMERO DE LA OPCIÓN DESEADA: ");
			  
			  switch(opcion) {
			  		case REALIZAR_VENTA:
			  			realizarVenta();
			  			break;
				  
			  		case REALIZAR_COMPRA:
			  			realizarCompra();
			  			break;
			  	
			  		case VER_ARTICULOS_SALUDABLES:
			  			break;
				  
			  		case VER_EL_ARTICULO_MAS_CARO:
			  			break;
				  
			  		case VER_ARTICULOS_CON_MENOS_STOCK_QUE_X :
			  			break;
				  
			  		case SALIR:
			  			break;
				  
			  		default:
					  break;
			  }
			  
			  
		  }while(opcion !=SALIR);
	  
	  
	  
	  }
	private void realizarCompra() {
		// TODO Auto-generated method stub
		
	}
	private void realizarVenta() {
		// TODO Auto-generated method stub
		
	}
	 
	

}
