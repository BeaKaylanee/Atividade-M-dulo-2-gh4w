package optional;

public class Teste {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		//System.out.println(cliente.getName().toUpperCase());
		
		
		if (cliente.getName().toUpperCase() != null) {
			System.out.println(cliente.getName().toUpperCase());
		}else {
			System.out.println("Nome não definido! ");
		}
	}

}
