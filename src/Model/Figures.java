package Model;

import java.io.IOException;

import conta.util.cores;

public abstract class Figures {

	private int id;
	private String nome;
	private float valor;
	
	public Figures(int id, String nome, float valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	public void produto() {
		System.out.println("ID: " + getId());
        System.out.println("Produto: " + getNome());
        System.out.println("Valor: " + getValor());
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
        System.out.println("ID: " + getId());
        System.out.println("Produto: " + getNome());
        System.out.println("Valor: " + getValor());
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
		
	
