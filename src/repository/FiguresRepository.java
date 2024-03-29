package repository;

import Model.Figures;

public interface FiguresRepository {

	public void procurarPorId(int id);

	public void procurarPorNome(String nome);

	public void listarTodas();

	public void atualizar(Figures produto);

	public void deletar(int id);

	public void comprar(int Id);

}
