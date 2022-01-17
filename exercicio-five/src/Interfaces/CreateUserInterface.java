package Interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Interfaces.ValidateCpf.*;
import Interfaces.InitialInterface.*;
import Interfaces.InitialInterface.*;
import br.com.five.principal.*;

public class CreateUserInterface {
	public static void main(String[] args) {
		
	}
	
	public static void renderUserForm() throws IOException {

		BufferedReader UserFormReader = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("\n\nInsira os dados de usuário");
		System.out.println("\nNome completo:");
		String name = UserFormReader.readLine();

		System.out.println("\nCPF (somente números):");
		String CPF = UserFormReader.readLine();
		
		System.out.println("\nSenha:");
		String password = UserFormReader.readLine();
		
		System.out.println("\nConfirmar senha:");
		String passwordConfirm = UserFormReader.readLine();
		
		System.out.println("\n\n\n");
		
		validateData(name, CPF, password, passwordConfirm);
		
	}
	
	public static void validateData(String name, String CPF, String password, String passwordConfirm) throws IOException {
		
		if(ValidateCpf.isCPF(CPF)==false) {
			System.out.println("CPF inválido!");	
			renderUserForm();
		} else {
			if(!password.equals(passwordConfirm)) {
				System.out.println("Erro na confirmação da senha!");
				renderUserForm();
			} else {
				
				if(password.length()<6) {
					System.out.println("A senha deve conter no mínimo 6 caracteres");
					renderUserForm();
				} else {
				
					CPF = ValidateCpf.printCPF(CPF);
					System.out.println("\n");
					System.out.println("Por favor, confirme se os dados estão corretos:\n");
					System.out.println("Nome completo:"+name);
					System.out.println("CPF:"+CPF);
					System.out.println("\n1 - Confirmar \n2 - Editar \n3 - Cancelar");
					
					BufferedReader UserFormConfirm = new BufferedReader(
							new InputStreamReader(System.in));
					
					String confirmInput = UserFormConfirm.readLine();
					validateConfirmInput(confirmInput, name, CPF, password);
				}
								
			}
		}
		
	}
	
	public static Usuario validateConfirmInput(String confirmInput, String name, String CPF, String password) throws IOException {
		switch(confirmInput) {
			case "1":
				System.out.println("=======>gerar objeto de usuário");
				Usuario user = new Usuario();
				user.setNome(name);
				user.setCpf(CPF);
				user.setSenha(password);
				UsuarioLista.add(user);
				InitialInterface.renderInitial();
				return user;
			case "2":
				renderUserForm();
				return null;
			case "3":
				InitialInterface.renderInitial();
				return null;
		}
		return null;

	}
}
