package br.com.five.principal;

public class UsuariosExemplo {
	public static void criarUsuarios() {
		Usuario user1 = new Usuario();
		user1.setNome("user1");
		user1.setCpf("888.907.840-59");
		user1.setSenha("123456");
		UsuarioLista.add(user1);
		
		Usuario user2 = new Usuario();
		user2.setNome("user2");
		user2.setCpf("038.259.420-74");
		user2.setSenha("6543210");
		UsuarioLista.add(user2);
		
		Usuario user3 = new Usuario();
		user3.setNome("user3");
		user3.setCpf("892.769.550-03");
		user3.setSenha("qwerty");
		UsuarioLista.add(user3);
		
		Usuario user4 = new Usuario();
		user4.setNome("user4");
		user4.setCpf("814.085.180-90");
		user4.setSenha("zxcvbn");
		UsuarioLista.add(user4);
		
	}
}
