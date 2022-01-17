package Interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Interfaces.CreateUserInterface.*;
import Interfaces.AccessUserInterface.*;
import br.com.five.principal.*;

public class InitialInterface {

	public static void main(String[] args) throws IOException {
		
		UsuariosExemplo.criarUsuarios();
		
		//AuthUserInterface.renderAuthUser(1);
		renderInitial();
	}
	
	public static void renderInitial() throws IOException {
		
		System.out.println("Bem vindo à AirFive!!");
		System.out.println("\n \n");
		System.out.println("O que você deseja?");
		System.out.println("\n \n");
		System.out.println("1. Criar conta de usuário \n2. Acessar conta de usuário \n3. Consultar voos");
		System.out.println("\nDigite o número da opção desejada (será considerado somente o primeiro dígito:");

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in), 1);
		
		String optionSelected = reader.readLine();
		
		optionSelected = optionSelected.trim();
		optionSelected = optionSelected.substring(0, 1);
		

		System.out.println(readOptions(optionSelected));
		
		reader.close();
		
	}

	public static String readOptions(String option) throws IOException {
		
		switch(option) {
		case "1":
			CreateUserInterface.renderUserForm();
			return " ";
		
		case "2":
			AccessUserInterface.renderAccessInterface();
			return "";
		
		case "3":
			FlightsInterface.renderMenuVoo();
			
		}
		
		return "Opção inválida";
	}

}
