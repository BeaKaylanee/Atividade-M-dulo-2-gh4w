package optional;

import java.util.Optional;

public class Teste2 {

	public static void main(String[] args) {


		Cliente cliente = new Cliente();

		Optional<Cliente> clienteOptional = Optional.ofNullable(cliente);
		System.out.println(clienteOptional.map(resposta -> resposta.getName()).orElse("Cliente não encontrado"));
	}

	
}
