package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.ListaFigures;
import Model.Figures;
import Model.Produto;
import repository.FiguresRepository;

public class ProdutosController implements FiguresRepository{

	
	  private List<ListaFigures> listaFigures = new ArrayList<>();

	    public ProdutosController() {
	        ListaFigures lista = new ListaFigures(1, "Lista de Produtos", 0, new ArrayList<>());

	        Produto produto1 = new Produto(1, "Luffy", 390.0f);
	        Produto produto2 = new Produto(2, "Roronoa Zoro", 350.0f);
	        Produto produto3 = new Produto(3, "Nami", 350.0f);
	        Produto produto4 = new Produto(4, "Usopp", 350.0f);
	        Produto produto5 = new Produto(5, "Sanji", 350.0f);
	        Produto produto6 = new Produto(6, "Chopper", 350.0f);
	        Produto produto7 = new Produto(7, "Nico Robin", 350.0f);
	        Produto produto8 = new Produto(8, "Franky", 350.0f);
	        Produto produto9 = new Produto(9, "Brook", 350.0f);
	        Produto produto10 = new Produto(10, "Jinbe", 350.0f);

	        lista.adicionarProduto(produto1);
	        lista.adicionarProduto(produto2);
	        lista.adicionarProduto(produto3);
	        lista.adicionarProduto(produto4);
	        lista.adicionarProduto(produto5);
	        lista.adicionarProduto(produto6);
	        lista.adicionarProduto(produto7);
	        lista.adicionarProduto(produto8);
	        lista.adicionarProduto(produto9);
	        lista.adicionarProduto(produto10);

	        listaFigures.add(lista);
	    }
}

this.setProdutos(this.getProdutos() - lista);
return true;
} 
	
	@Override
	public void procurarPorId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void procurarPorNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Figures produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprar(int Id) {
		// TODO Auto-generated method stub
		
	}

}
