package Interfaces;

import java.io.IOException;
import java.util.Scanner;

public class FlightsInterface {
	
	static Scanner ler = new Scanner(System.in);
    static String ciaAerea[] = new String[3]; //armazena o nome da companhia
    static String linhaAerea[] = new String[3]; //armazena o trecho
    static String numeroVoo[] = new String[3]; //armazena o numero do voo
    static String CPF[] = new String[4]; //guarda o RG do passageiro
    static int disp[] = new int[3]; //armazena a qtd de lugares
    static boolean vazio[] = new boolean[3]; //indica se a posição está vazia
    static boolean reservado[] = new boolean[3]; //indica se o voo está reservado pelo usuário 
    static int qtdLugares[] = new int[3]; //guarda o a qtd de lugares de cada voo
    static int i = 0, j = 0;; //variavel usada nos laços
        
    public static void renderFlightsMenu() throws IOException {
        int menuVoo = 0; //menu do voo
        int menuPrincipal = 0; //menu principal
        int codVoo = 100; //codigo do voo    
        CadastrarVoo();
        
      //posição  vazia
        for (i = 0; i < ciaAerea.length; i++) {
            vazio[i] = false;
        }
        //inicializar o vetor
        for (i = 0; i < ciaAerea.length; i++) {
            CPF[i] = "";
        }
        do {
            if (j <=1) {
                j = j+1;
            }
            System.out.println("\nMenu Principal:"
                    + "\n1 - Menu Voo - Cadastro da Linha Aerea"
                    + "\n2 - Reserva de Passagens"
                    + "\n3 - Ver disponibilidade de lugares"
                    + "\n4 - Cancelamento de Reserva"
                    + "\n5 - Fechar programa");
            menuPrincipal = ler.nextInt();

            switch (menuPrincipal) {
                case 1:
                    renderMenuVoo();
                    break;
                case 2:
                    System.out.print("RESERVA");
                    Reserva(codVoo); //função reserva de passagens
                    break;
                case 3:
                    System.out.print("VER RESERVA\n");
                    System.out.print("Informe o codigo do Voo:");
                    codVoo = ler.nextInt();
                    VerReserva(codVoo); //função ver reservas
                    break;
                case 4:
                    System.out.print("CANCELAR RESERVA\n");
                    System.out.print("Informe o codigo do Voo:");
                    codVoo = ler.nextInt();
                    CancelarReserva(codVoo); //Função cancelar reserva
                    break;
                case 5:
                    System.out.println("FECHAR PROGRAMA");
                    break;
            } 
        } while (menuPrincipal != 5);
    }
    
    public static void renderMenuVoo() throws IOException {
    	int menuVoo = 0;
    	int codVoo = 100;

    	CadastrarVoo();
    	
    	do {
            if (j <= 1) {    
            	//cadastro de linhas aereas automatico
                j = j+1;
            }
            System.out.println("\nMenu Voo:"
                    + "\n1 - Ver Opções de Voo"
                    + "\n2 - Voltar ao Menu Principal");
           
            menuVoo = ler.nextInt();
            switch (menuVoo) {
                case 1:
                    System.out.println("DISPONIBILIDADE DE VOO");
                    OpcoesVoo(i); //função ver opções de voo
                    break;
                case 2:
                	InitialInterface.renderInitial();
                    break;
            } //fim do switch
        } while (menuVoo != 3); //fim do laço de repetição
    }
    
  //cadastro de voo
    public static void CadastrarVoo() {
        numeroVoo[0] = "001";
        ciaAerea[0] = "TAM";
        linhaAerea[0] = "Rio de Janeiro -> São Paulo";
        disp[0] = 10;
        vazio[0] = true;
        reservado[0] = false;
        qtdLugares[0] = 20;

        numeroVoo[1] = "002";
        ciaAerea[1] = "GOL";
        linhaAerea[1] = "Rio de Janeiro -> Brasília";
        disp[1] = 8;
        vazio[1] = true;
        reservado[1] = false;
        qtdLugares[1] = 9;
       
        numeroVoo[2] = "003";
        ciaAerea[2] = "Avianca";
        linhaAerea[2] = "Rio de Janeiro -> Belo Horizonte";
        disp[2] = 20;
        vazio[2] = true;
        reservado[2] = false;
        qtdLugares[2] = 6;
    } 
    
    //opcoes de voo
    public static void OpcoesVoo(int i) {
        for (i = 0; i < ciaAerea.length; i++) {
            if (vazio[i]) {
                System.out.printf("\nCodigo do Voo: %s", numeroVoo[i]);
                System.out.printf("\nEmpresa aerea: %s", ciaAerea[i]);
                System.out.printf("\nOrigem -> Destino: %s", linhaAerea[i]);
                System.out.printf("\nNumero de lugares disponiveis: %d \n", disp[i]);
            } 
        }
    } 
    
    //reserva de voo
    public static void Reserva(int codV) {
       
        System.out.print("\nInforme o codigo do Voo:");
        codV = ler.nextInt();

 
        if (disp[codV - 1] > 0) {
            System.out.print("Informe o CPF do passageiro:");
            CPF[codV - 1] = ler.next();

            disp[codV - 1] -= 1;
           
            System.out.printf("Reserva confirmada para %s no voo %s da Empresa %s\n\n",
                    CPF[codV - 1], numeroVoo[codV - 1], ciaAerea[codV - 1]);
           
            reservado[codV - 1] = true;
            CPF[codV - 1]=""; 
        } else {
            System.out.println("--------------------------------------------------------------\n"
                    + "Não ha disponibilidade de vaga para este voo\n"
                    + "--------------------------------------------------------------"+disp[codV-1]);
        }
    } 
    
    //reserva de passagens
    public static void VerReserva(int codV) {
        if (disp[codV - 1] > 0) {
            System.out.printf("%d lugar(es) disponivel(is) para o voo %s da Empresa %s\n",
                    disp[codV - 1], numeroVoo[codV - 1], ciaAerea[codV - 1]);
        } else {
            System.out.println("--------------------------------------------------------------\n"
                    + "Não ha disponibilidade de vaga para este voo\n"
                    + "--------------------------------------------------------------");
        } 
    }
    
    //cancelar reserva
    public static void CancelarReserva(int codV) {
        if (disp[codV - 1] < qtdLugares[codV - 1]) {
                
        		if(reservado[codV -1]==true) {	
	        		CPF[codV - 1] = ler.next();
	           
	                //atualiza a disponibilidade de lugares
	                disp[codV - 1] += 1;
	                reservado[codV -1] = false;

	                System.out.println("Operação realizada com sucesso!");
	        	} else {
	                System.out.println("Não ha reserva para este voo");
	            }
           
        } else {
            System.out.println("Não ha reserva para este voo");
        }
    }

}
