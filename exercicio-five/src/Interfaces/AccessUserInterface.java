package Interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import br.com.five.principal.*;
import Interfaces.CreateUserInterface.*;

public class AccessUserInterface {

	public static void renderAccessInterface() throws IOException {
		
		BufferedReader UserAccessReader = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		System.out.println("\n\n");
		System.out.println("Informe os dados da sua conta");
		
		System.out.println("\nCPF (com pontos e traço):");
		String CPF = UserAccessReader.readLine();
		int index = UsuarioLista.indexOfCpf(CPF);
		validateUser(CPF, index);
		
		System.out.println("\nSenha:");
		String password = UserAccessReader.readLine();
		password = password.toString();
		validatePassword(password, index);

	}
	
	public static void validateUser(String cpf, int index) throws IOException {
		
		if(index == -1) {
			System.out.println("O CPF informado não é válido ou o usuário não é cadastrado.");
			renderAccessInterface();
		} 
	}
	
	public static void validatePassword(String password, int index) throws IOException {
		String correctPass = UsuarioLista.getAllPasswords().get(index);
		String name = UsuarioLista.getAllNames().get(index);
				
		if(!password.equals(correctPass)) {
			System.out.println("Senha incorreta!");
			renderAccessInterface();
		} else {
			System.out.println("\nAcesso liberado!");
			AuthUserInterface.renderAuthUser(index);
		}
		
	}
	
}
