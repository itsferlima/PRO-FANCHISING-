package models;

public class Produto {
	
	private String nome;
	private double preco;
	private Ingrediente ingrediente;
	
	
// GET and SET
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Ingrediente getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	
//to String
	@Override
	public String toString() {
		return "Produto [getNome()=" + getNome() + ", getPreco()=" + getPreco() + ", getIngrediente()="
				+ getIngrediente() + "]";
	} 
	
	

}
