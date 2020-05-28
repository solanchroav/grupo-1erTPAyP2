
public class Cliente {
	private String alias, cuil;
	
	public Cliente(String alias, String cuil) throws ExcepcionCliente {
		
		if (!validarSiEsNumerico(cuil)) {
			throw new ExcepcionCliente("El CUIL no es numérico.");
		}
		
		if (alias.trim().isEmpty() || cuil.trim().isEmpty()) {
			throw new ExcepcionCliente("Alguno de los campos Cliente esta vacío.");
		}
		
		if (alias == null || cuil == null) {
			throw new ExcepcionCliente("Alguno de los campos Cliente es nulo.");
		}
		
		if (cuil.trim().length() != 11) {
			throw new ExcepcionCliente("El largo del CUIL es de 11.");
		}
		
		
		
		this.alias = alias.trim();
		this.cuil = cuil.trim();
		
		
	}
	
	public String obtenerAlias() {
		return alias;
	}
	
	public String obtenerCuil(){
		return cuil;
	}
	
	
	
	/**
	 * @POST Verifica que la variable numero de tipo String sea un Integer
	 * 		
	 * @param numero
	 * @return true/false
	 */
	public boolean validarSiEsNumerico(String numero) {
		try {
			Long.parseLong(numero);
			
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
			return false;
			
		}
		
		return true;
		
	}
	
	
}
