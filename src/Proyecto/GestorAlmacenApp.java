package Proyecto;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorAlmacenApp {

	// menu de los casos de uso

	private final static int REALIZAR_VENTA = 1; // include MostrarFactura; extend GuardarFacturaEnFichero
	private final static int REALIZAR_COMPRA = 2;
	private final static int VER_ARTICULOS_SALUDABLES = 3;
	private final static int VER_EL_ARTICULO_MAS_CARO = 4;
	private final static int VER_ARTICULOS_CON_MENOS_STOCK_QUE_X = 5;
	private final static int SALIR = 0;

	/*
	 * final String NOMBRE_FICHERO = "/Warehouse/datos/bebidas.txt"; Scanner scan =
	 * new Scanner(System.in);
	 */

	public void run() throws FileNotFoundException, ParseException {

		Scanner scan = new Scanner(System.in);

		Almacen articulosAlmacen = new Almacen();
		articulosAlmacen.cargarDatos();

		int opcion;

		do {

			menuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case REALIZAR_VENTA:
				Factura factura=new Factura();
				SimpleDateFormat fecha=new SimpleDateFormat();
				
				System.out.println("introduce el numero de factura: ");
				factura.setNumero(Integer.parseInt(scan.nextLine()));
				System.out.println("introduce el nombre de la empresa: ");
				factura.setNombreEmpresa(scan.nextLine());
				System.out.println("Fecha de factura (dd/MM/yyyy)");
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				factura.setFecha(sdf.parse(scan.nextLine()));
				System.out.println("introduce el concepto");
				factura.setConcepto(scan.nextLine());
				
				break;
				

			case REALIZAR_COMPRA:
				realizarCompra();
				break;

			case VER_ARTICULOS_SALUDABLES:
				System.out.println("Son: ");
				for (Articulo a : articulosAlmacen.articulos) {
					if (a.saludable()) {
						System.out.println(a);
					}
				}
				break;

			case VER_EL_ARTICULO_MAS_CARO:
				System.out.println("El articulo más caro del almacen es: " + articulosAlmacen.elMasCaro());
				break;

			case VER_ARTICULOS_CON_MENOS_STOCK_QUE_X:
				System.out.println("ver el articulo que tenga menos stock de??introduce el número :");

				int x = Integer.parseInt(scan.nextLine());

				System.out.println("los articulos con menos stock de " + x + " son: ");
				int contador = 0;
				for (Articulo a : articulosAlmacen.articulos) {
					if (a.getStock() < x) {
						System.out.println(a.getName() + " " + a.getMark() + ",con codigo " + a.getCode() + " "
								+ " quedan :" + a.getStock() + " unidades");
						contador++;
						 
						// También se podría con "visualizarArticulo, saldria el articulo entero..
						
						/* a.visualizarArticulo(); */
						}

							}
					if (contador == 0) {
					System.out.println("No hay productos con stock menor a " + x);
						}

						break;

			case SALIR:
				System.out.println("AU REVOIR, CIAO, ADIOS, AGUR, BYE..AIOOOO!");
				break;

			default:
				break;
				}

			} while (opcion != SALIR);

	}

	

	private void menuPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("    MENU     ");
		System.out.println(REALIZAR_VENTA + ".-Realizar venta");
		System.out.println(REALIZAR_COMPRA + ".-Realizar compra");
		System.out.println(VER_ARTICULOS_SALUDABLES + ".-Ver articulos saludables");
		System.out.println(VER_EL_ARTICULO_MAS_CARO + ".- El artículo más caro es...");
		System.out.println(VER_ARTICULOS_CON_MENOS_STOCK_QUE_X + ".-Saber qué articulos tienen menos"
				+ "stock de...la cantidad que digas");
		System.out.println(SALIR + " SAlIR");

		System.out.println("MARQUE EL NÚMERO DE LA OPCIÓN DESEADA: ");

	}

	private void realizarCompra() throws FileNotFoundException {
		Scanner scan=new Scanner(System.in);
		Almacen articulosAlmacen = new Almacen();
		articulosAlmacen.cargarDatos();
		
		System.out.println("Dime el codigo del articulo que quieres :");
		String codigoCompra=scan.nextLine();
		System.out.println("dime cuantos has comprado");
		int cantidadCompra=Integer.parseInt(scan.nextLine());
		
		for (Articulo a : articulosAlmacen.articulos) {
			if(codigoCompra.equals(a.getCode())) {
				a.incrementarStock(cantidadCompra);
				System.out.println("Ahora el stock de "+a.getName()+" "+a.getMark()+" con codigo "+ a.getCode()+" es: "+a.getStock());
			}
			
		}
				
	}

	

	private void imprimirOpciones() {
		System.out.println("I - Imprimir Factura");
		System.out.println("L - introducir linea ed factura");
		
	}

}
