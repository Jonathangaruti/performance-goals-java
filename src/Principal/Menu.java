package Principal;

import java.util.InputMismatchException;

import java.util.Scanner;

import Conta.util.cores;

import Model.Figures;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		// Teste de produtos
		Figures produto1 = new Figures(1, "Figure Luffy", 200.0f);
		produto1.visualizar();
		produto1.comprar(1);
		produto1.visualizar();
		produto1.produto();
		produto1.visualizar();
		

		Scanner leia = new Scanner(System.in);

		int opcao, id, quantidade;
		float valor;
		String nome;

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
			System.out.println("                ╰─────────────────────────────╯                            ");
			System.out.println("                                                                ");
			System.out.println("                                                                ");
			System.out.println("              1 - buscar por nome                               ");
			System.out.println("              2 - Listar todos os produtos                      ");
			System.out.println("              3 - Buscar action figure por id                   ");
			System.out.println("              4 - Atualizar                                     ");
			System.out.println("              5 - Comprar                                     ");
			System.out.println("              6 - Deletar                                       ");
			System.out.println("              7 - Sair                                          ");
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

			if (opcao == 6) {
				System.out.println(cores.TEXT_WHITE_BOLD + "\nAction Figures - O melhor figure você encontra aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Buscar por nome\n\n");

				break;
			case 2:
				System.out.println("Listar todos os produtos\n\n");

				break;
			case 3:
				System.out.println("buscar action figure por ID - (numeros inteiros)\n\n");

				break;
			case 4:
				System.out.println("Atualizar lista\n\n");

				break;
			case 5:
				System.out.println("Comprar\n\n");

				break;
			case 6:
				System.out.println("deletar action figure\n\n");

				break;
			case 7:
				System.out.println("Sair\n\n");
				
				break;
				
			default:
				System.out.println("\nOpção Inválida!\n");
				break;

			}

		}

	}
}
