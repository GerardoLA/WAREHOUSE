package Proyecto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Main {
	
		/* Programa que lanza la aplicacion principal
		 */
	
		public static void main(String[]args) throws FileNotFoundException, ParseException {
			GestorAlmacenApp gaa = new GestorAlmacenApp();
			gaa.run();
		}
}
