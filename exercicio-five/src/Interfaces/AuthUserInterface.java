package Interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.five.principal.UsuarioLista;

public class AuthUserInterface {

	public static void renderAuthUser(int index) throws IOException{
		
		String name = UsuarioLista.getAllNames().get(index);
		
		System.out.println("\nOlá, "+name);
		System.out.println("\n");
		System.out.println("\n1. Buscar voos");
		System.out.println("\n2. Gerenciar reservas");
		System.out.println("\n4. Sair");
		System.out.println("\nSelecione a opção desejada");
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in), 1);
		
		String optionSelected = reader.readLine();
		
		optionSelected = optionSelected.trim();
		optionSelected = optionSelected.substring(0, 1);
		

		System.out.println(readOptions(optionSelected));
		
	}
	
	public static String readOptions(String option) throws IOException {
		
		switch(option) {
		case "1":
			FlightsInterface.renderMenuVoo();
			return " ";
		
		case "2":
			FlightsInterface.renderFlightsMenu();
			return "";
		
		case "3":
			InitialInterface.renderInitial();
			
		}
		
		return "Opção inválida";
	}
	
}
