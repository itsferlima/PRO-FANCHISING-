package views;

import controllers.ProdutoController;
import models.Produto;

public class ListarProduto {
	
	public static void renderizar() {
		System.out.println("\n -- Lista de produtos --");
		
		for(Produto produtoCadastrado: ProdutoController.listar()) {
			System.out.println("\n"+produtoCadastrado);
		}
	}

}
