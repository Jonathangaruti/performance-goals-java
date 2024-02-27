package Controller;

import Model.Figures;

public class ListaFigures extends Figures {

	public ListaFigures(int id, String nome, float valor) {
		super(id, nome, valor);
	}

	@Override
	public String toString() {
		return "id: " + getId() + ", nome: " + getNome() + ", valor: " + getValor();
	}

}
