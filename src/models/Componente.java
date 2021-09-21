package models;

public abstract class Componente {
	
	private int quantidade;

//GET and SETrs
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
//toString
	@Override
	public String toString() {
		return "Componente [getQuantidade()=" + getQuantidade() + "]";
	}
	
	

}
