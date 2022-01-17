package br.com.five.principal;

public class AeroportosExemplo {
	
	public static void criarAeroportos() {
		Aeroporto GRU = new Aeroporto();
		GRU.setNome("Aeroporto Internacional de Guarulhos");
		GRU.setMunicipio("São Paulo");
		
		Aeroporto SDU = new Aeroporto();
		SDU.setNome("Aeroporto Internacional Santos Dumont");
		SDU.setMunicipio("Rio de Janeiro");
		
		Aeroporto BSB = new Aeroporto();
		BSB.setNome("Aeroporto Internacional de Brasília");
		BSB.setMunicipio("Brasília");
		
		Aeroporto CNF = new Aeroporto();
		CNF.setNome("Aeroporto Internacional de Confins");
		CNF.setMunicipio("Belo Horizonte");
		
	}
	
}
