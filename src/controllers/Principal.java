package controllers;

import java.text.ParseException;
import java.util.Scanner;
import views.CadastrarProduto;

public class Principal {
		
		private static Scanner print = new Scanner(System.in);
		
		public static void main (String args []) throws ParseException {
			
			int opcao;
			
			do{
				System.out.println("\n".repeat(2));
				System.out.println("-- CONTROLE DE ESTOQUE -- PRO");
				System.out.println("\n1. Cadastre produtos ");
				System.out.println("0.Sair");
				opcao = TratamentoExcecao.lerInteiro("\nDigite uma opção: ");
				
				switch(opcao) {
				case 1:
					CadastrarProduto.renderizar();
					break;
				case 0:
					System.out.println("\nAplicaçaõ finalizada...");
					break;
				}
			}while (opcao != 0);	
	}
}

