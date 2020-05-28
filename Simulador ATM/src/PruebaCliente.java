import org.junit.*;

public class PruebaCliente {

	private Cliente cliente;
		
	
	@Test (expected = ExcepcionCliente.class)
	public void creaClienteDefectuoso() throws ExcepcionCliente {
		cliente = new Cliente("pizza.con.anana", "asdfgh");	    
	}
	
		
	@Test
	public void clienteCreadoConExito() throws ExcepcionCliente {
		cliente = new Cliente("arroz.con.pollo", "20252525201");		
		Assert.assertEquals("arroz.con.pollo", cliente.obtenerAlias());
		Assert.assertEquals("20252525201", cliente.obtenerCuil());
	}
	
	
	
}
