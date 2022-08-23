package entities;

public class Product {
	private String name;
	private double Price;
	private int quantity;
	
	public Product() {}
	public Product(String name, double price, int quantity) {
		this.name = name;
		Price = price;
		this.quantity = quantity;
	}
	public Product(String name, double price) {
		this.name = name;
		Price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQuantity() {
		return quantity;
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