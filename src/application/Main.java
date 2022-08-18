package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Entre com os dados do produto");
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();

		System.out.print("Preco: ");
		double Price = sc.nextDouble();
		 
		Product product = new Product( name, Price, quantity);
		
		System.out.println(product);
		
		System.out.print("\n\nEntre com a quantidade de produtos a adicionar: ");
		int qtde = sc.nextInt();
		product.addProducts(qtde);
		
		System.out.printf("\n\nEstoque atualizado: " + product);
		
		System.out.print("\n\nEntre com a quantidade de produtos a remover: ");
		qtde = sc.nextInt();
		product.removeProducts(qtde);
		
		System.out.printf("\n\nEstoque atualizado: " + product);
		
		sc.close();
	}

}