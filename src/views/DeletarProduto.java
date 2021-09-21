package views;

import java.util.Scanner;

import controllers.ProdutoController;
import models.Produto;

public class DeletarProduto {
	
	private static Scanner print = new Scanner(System.in);
	private static Produto produto;
	
	public static void renderizar() {
		
		produto = new Produto();
		
		System.out.println("\nDigite o nome do produto que deseja deletar");
		String nome = print.next();
		produto = ProdutoController.buscarPorNome(nome);
		if(produto != null) {
			if(ProdutoController.deletar(nome)) {
				
			}
		}
		
	}

}
