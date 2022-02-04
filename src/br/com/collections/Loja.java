package br.com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Loja {

	public static void main(String[] args) {
		
		Collection<String> estoque = new ArrayList<>();
		
		//populando collection
		estoque.add("GPU");
		estoque.add("CPU");
		estoque.add("Mouse");
		estoque.add("Teclado");
		estoque.add("Monitor");
		
		//exibindo todos os itens
		System.out.println("Lista de produtos: " + estoque);
		
		//remoção de item
		estoque.remove("Mouse");
		
		//adição de novo item
		estoque.add("Cadeira");
		
		//exibindo todos os itens (atualizado)
		System.out.println("Lista de Produtos Atualizada: " + estoque);
	}

}
