package models;

public class Ingrediente extends Componente{
	
	private String nome;
	private int unidadeDeMedida;
	private double precoUnitario;
	
	
//GET and SETrs
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getUnidadeDeMedida() {
		return unidadeDeMedida;
	}
	public void setUnidadeDeMedida(int unidadeDeMedida) {
		this.unidadeDeMedida = unidadeDeMedida;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

//toString
	@Override
	public String toString() {
		return "Ingrediente [getNome()=" + getNome() + ", getUnidadeDeMedida()=" + getUnidadeDeMedida()
				+ ", getPrecoUnitario()=" + getPrecoUnitario() + "]";
	}
	
	

	
}
