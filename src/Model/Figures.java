package Model;

public abstract class Figures {

	private int id;
	private String nome;
	private float valor;

	public Figures(int id, String nome, float valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
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
		if (this.getId() == id) {
			System.out.println("\n Produto comprado!");
			return true;
		} else {
			System.out.println("\n Produto não encontrado!");
			return false;
		}
	}

	public void visualizar() {

		System.out.println("\n************************************");
		System.out.println("Dados do produto");
		System.out.println("************************************");
		System.out.println("Id do produto: " + this.id);
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Valor do produto: " + this.valor);

	}

}
