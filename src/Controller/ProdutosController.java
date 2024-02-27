package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.Figures;
import repository.FiguresRepository;

public class ProdutosController implements FiguresRepository{

	
	  private List<Figures> listaFigures = new ArrayList<Figures>();
	private int[] id = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	    public  ProdutosController() {

	    	Figures figure1 = new ListaFigures(1, "Luffy", 390.0f);
	    	Figures figure2 = new ListaFigures(2, "Roronoa Zoro", 350.0f);
	    	Figures figure3 = new ListaFigures(3, "Nami", 350.0f);
	    	Figures figure4 = new ListaFigures(4, "Usopp", 350.0f);
	    	Figures figure5 = new ListaFigures(5, "Sanji", 350.0f);
	    	Figures figure6 = new ListaFigures(6, "Chopper", 350.0f);
	    	Figures figure7 = new ListaFigures(7, "Nico Robin", 350.0f);
	    	Figures figure8 = new ListaFigures(8, "Franky", 350.0f);
	    	Figures figure9 = new ListaFigures(9, "Brook", 350.0f);
	    	Figures figure10 = new ListaFigures(10, "Jinbe", 350.0f);
	    	
	        listaFigures.add(figure1);
	        listaFigures.add(figure2);
	        listaFigures.add(figure3);
	        listaFigures.add(figure4);
	        listaFigures.add(figure5);
	        listaFigures.add(figure6);
	        listaFigures.add(figure7);
	        listaFigures.add(figure8);
	        listaFigures.add(figure9);
	        listaFigures.add(figure10);
} 
	
	@Override
	public void procurarPorId(int id) {
		
		boolean encontrado = false;
		
		for (Figures figure : listaFigures) {
            if (figure.getId() == id) {
                encontrado = true;
                
                System.out.println("Produto encontrado: " + figure);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto com id " + id + " não foi encontrado!");
        }
    }
		
	   
	@Override
	public void listarTodas() {
	    System.out.println("Lista de todos os produtos:");

	    for (Figures figure : listaFigures) {
	        System.out.println(figure);
	    }
	}


	@Override
	public void comprar(int id) {
		for (Figures figure : listaFigures) {
            if (figure.getId() == id) {
                System.out.println("Compra realizada com sucesso do produto: " + figure);
                return;
            }
        }

        System.out.println("Produto com id " + id + " não encontrado para compra.");
		
	}

	@Override
	public void procurarPorNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Figures produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}
		
	}

