package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Entre com os dados do produto");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		
		System.out.print("Quantidade: ");
		product.quantity = sc.nextInt();

		System.out.print("Preco: ");
		product.Price = sc.nextDouble();
		 
		System.out.println(product);
		
		sc.close();
	}

}