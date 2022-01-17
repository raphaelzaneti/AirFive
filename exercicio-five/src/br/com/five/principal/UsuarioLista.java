package br.com.five.principal;
import java.util.*;
import br.com.five.principal.*;

public class UsuarioLista {
	
	public static void main(String[]args) {
		Usuario teste1 = new Usuario();
		teste1.setNome("teste");
		
		Usuario teste2 = new Usuario();
		teste2.setNome("02744012076");
		
		UsuarioLista.add(teste1);
		UsuarioLista.add(teste2);
		
		UsuarioLista.get(0);	
		
		
	}
	
	static ArrayList<Usuario> UsuarioLista = new ArrayList<Usuario>();

	public static void add(Usuario teste) {
		UsuarioLista.add(teste);
	}

	public static Usuario get(int i) {
		return UsuarioLista.get(i);
	}
	
	public static ArrayList<String> getAllNames(){
		int size = UsuarioLista.size();
		
		ArrayList<String> allNames = new ArrayList<String>(); 
		
		for(int i = 0; i<size; i++) {
			allNames.add(UsuarioLista.get(i).getNome());
		}
		
		return allNames;
	}
	
	public static ArrayList<String> getAllCpf(){
		int size = UsuarioLista.size();
		
		ArrayList<String> allCpf = new ArrayList<String>(); 
		
		for(int i = 0; i<size; i++) {
			allCpf.add(UsuarioLista.get(i).getCpf());
		}
		
		return allCpf;
	}
	
	public static int indexOfCpf (String cpf) {
		int size = UsuarioLista.size();
		
		ArrayList<String> allCpf = new ArrayList<String>(); 
		
		for(int i = 0; i<size; i++) {
			allCpf.add(UsuarioLista.get(i).getCpf());
		}
		
		if(allCpf.indexOf(cpf) != -1)
			return allCpf.indexOf(cpf);
		
		return -1;
	}
	
	public static ArrayList<String> getAllPasswords(){
		int size = UsuarioLista.size();
		
		ArrayList<String> allPass = new ArrayList<String>(); 
		
		for(int i = 0; i<size; i++) {
			allPass.add(UsuarioLista.get(i).getSenha());
		}
		
		return allPass;
	}
	
}
