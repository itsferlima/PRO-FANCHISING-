package controllers;

import java.util.ArrayList;

import models.Componente;
import models.Ingrediente;
import models.Produto;

public class ProdutoController {
	
	private static ArrayList<Produto> produtos = new ArrayList<>();
	
//Cadastrar
	public static void cadastrar(Produto produto) {
		produtos.add(produto);
	}
//Listar o produto
	public static ArrayList<Produto>listar(){
		return produtos;
	}
//Buscar por produtos
	public static Produto buscarPorNome(String nome) {
		for(Produto produtoCadastrado: produtos) {
			if(produtoCadastrado.getNome().equals(nome)) {
				return produtoCadastrado;
			}
		}
		return null;
	}
//Editar produto
	public static Boolean editar (String nome, String novoNome, double novoPreco, Ingrediente novoIngrediente) {
		for (Produto produtoCadastrado: produtos) {
			if(produtoCadastrado.getNome().equals(nome)) {
				if(novoNome != null) {
					produtoCadastrado.setNome(novoNome);
				}
				if(novoPreco != double) {
					produtoCadastrado.setPreco(novoPreco);
				}
				if(novoIngrediente != null) {
					produtoCadastrado.setIngrediente(novoIngrediente);
				}
			}return true;
		}
	} 
	
//Deletar produto
	public static Boolean deletar (String nome) {
		for(Produto produtoCadastrado: produtos) {
			if(produtoCadastrado.getNome().equals(nome)) {
				produtos.remove(produtoCadastrado);
				return true;
			}
		}
		return false;
	}
}
	

