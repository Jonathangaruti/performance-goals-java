package repository;

import Model.Figures;
import Model.ListaFigures;

public interface FiguresRepository {

	public void procurarPorId(int id);
	public void procurarPorNome(String nome);
	public void listarTodas();
	public void atualizar (Figures produto);
	
	
	public void comprar(int Id);
	
}
