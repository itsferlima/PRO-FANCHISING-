package views;

import java.util.Scanner;

import models.Ingrediente;
import models.Produto;

public class CadastrarProduto {
	
	private static Produto produto;
	private static String nome;
	private static double preco;
	private Ingrediente ingrediente; 
	private static Scanner print = new Scanner(System.in);
	
	public static void renderizar() {
		
		produto = new Produto();
		print = new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("\n-- CADASTRAR PRODUTO --\n");
		System.out.println("Digite o nome do produto: ");
		produto.setNome(print.next());
	;
	}

}
