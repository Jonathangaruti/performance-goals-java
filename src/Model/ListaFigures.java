package Model;


import java.util.ArrayList;
import java.util.List;

public class ListaFigures extends Figures {

	private List<Produto> produtos;
	
	public ListaFigures(int id, String nome, float valor, List<Produto> produtos) {
		super(id, nome, valor);
		this.produtos = produtos;
	}
	
	public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
   
    
    // adicionar produtos
    public void adicionarProduto(Produto produto) {
    	if (produtos == null) {
    		produtos = new ArrayList<>();
    	}
    	
    	produtos.add(produto);	
    }
    
    // remover produtos
    
    public void removerProdutos(ListaFigures lista){
        if (lista.getProdutos() != null) {
            produtos.removeAll(lista.getProdutos());
        }
    }
    
    @Override
    public void visualizar() {
        super.visualizar();
        
        System.out.println("Produtos comprados:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
 
		    	
    
    

	
