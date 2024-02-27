package Principal;

import java.io.IOException;
import java.util.InputMismatchException;

import java.util.Scanner;

import Conta.util.cores;
import Controller.ProdutosController;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		ProdutosController figures = new ProdutosController();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, id;

		while (true) {

			System.out.println(cores.TEXT_YELLOW + cores.ANSI_BLACK_BACKGROUND +

					"                 ___________________                            ");
			System.out.println("                │     GENERATION    │                           ");
			System.out.println("                ─────────────────────                           ");
			System.out.println("                ││                │││                           ");
			System.out.println("                ││     ACTION     │││                           ");
			System.out.println("                ││     FIGURES    │││                           ");
			System.out.println("                ││      ____      │││                           ");
			System.out.println("                ││     │    │     │││                           ");
			System.out.println("                ││____ │____│ ____│││                           ");
			System.out.println("                ╰─────────────────────────────╯                           ");
			System.out.println("                                                                ");
			System.out.println("                                                                ");
			System.out.println("              1 - Listar todos os produtos                      ");
			System.out.println("              2 - Buscar action figure por id                   ");
			System.out.println("              3 - Comprar                                       ");
			System.out.println("              4 - Sair                                          ");
			System.out.println("────────────────────────────────────────────────────────────────");
			System.out.println("Entre com a opção desejada:                                     ");
			System.out.println("                                                                " + cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 4) {
				System.out.println(cores.TEXT_WHITE_BOLD + "\nAction Figures - O melhor figure você encontra aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 2:
				System.out.println("Buscar por action figure por ID - (numeros inteiros)\n\n");
				
				System.out.println("Digite o ID: (de 1 a 10");
				id = leia.nextInt();
				figures.procurarPorId(id);

				keyPress();
				break;
				
			case 1:
				System.out.println("Listar todos os produtos\n\n");
				figures.listarTodas();
				
				
				keyPress();
				break;

			case 3:
				System.out.println(cores.TEXT_WHITE_BOLD + "Comprar\n\n");
				System.out.println("Digite o id da compra: ");
				id = leia.nextInt();
			
				figures.comprar(id);
				
				keyPress();
				break;
				

			case 4:
				System.out.println("Sair\n\n");
				
				break;
				
			default:
				System.out.println("\nOpção Inválida!\n");
				break;

			}

		}

	}
	
		
		public static void keyPress() {

			try {
				System.out.println("\n\nPressione Enter para Continuar...");
				System.in.read();

			} catch (IOException e) {

				System.out.println("Você pressionou uma tecla diferente de enter!");

			}
		
	}
}
