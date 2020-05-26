import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Cajero {
	
	private static int billetesDeCien = 500;
	private static int billetesDeQuinientos = 500;
	private static int billetesDeMil = 500;
	
			
	public static void main(String[] args) {
		
		
		
	}
	
	/**
	 * @POST Devuelve true si la tarjeta es encontrada en la posicion 0 del array buscado del archivo tarjetas.txt
	 * 
	 * @param número de tarjeta
	 * @return boolean
	 * @throws IOException
	 */
	private boolean lectorTarjeta(String tarjeta) throws IOException {
		
		try {
			BufferedReader lector = new BufferedReader(new FileReader("tarjetas/tarjetas.txt"));
			
			
			
			try {
				String linea = lector.readLine();
				
				boolean verificador = false;
				
				
				while (linea != null && verificador == false) {
					
					String[] campos = linea.split(",");
					
					if(tarjeta.equals(campos[0]) ) {
						verificador = true;
						
					} else {
						linea = lector.readLine();
					}
					
				}
				
				return verificador;
					
				
				
			} finally {
				lector.close();
			}
			
			
			
			
		} catch(FileNotFoundException file) {
			throw new Error(file);
		}
	}
}
