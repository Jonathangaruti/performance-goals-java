package Model;

public class Figures {

	private int id;
	private String nome;
	private float valor;
	
	public Figures(int id, String nome, float valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	public void produto() {
	    System.out.println("Produto: " + getNome());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public boolean comprar(int id) {
		if(this.getId() != id) {
			System.out.println("\n Não encontrado!");
			return false;
		}
			return true;
			
		}
	
	public void visualizar() {

		 String produto = this.nome.equals("produtos") ? "produtos" : "outro";
	        System.out.println("Produto: " + produto);
	    }
		
	}
	
