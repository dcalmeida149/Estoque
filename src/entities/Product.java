package entities;

public class Product {
	private String name;
	private double Price;
	private int quantity;
	
	public Product(String name, double Price, int quantity) {
		this.name = name;
		this.Price = Price;
		this.quantity = quantity;
	}
	public String getName() { // aula 79 - - encapsulamento
		return name;
	}
	public void setName(String name) { //aula 78 - encapsulamento
		this.name = name;
	}
	public double TotalValueInStock() {
		return Price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString(){
		return name
				+ ", R$"
				+ String.format("%.2f", Price)
				+ ", "
				+ quantity
				+ " Unidades ,"
				+ "Valor estoque: "
				+ String.format("%.2f",TotalValueInStock()); //teste push
	}
}