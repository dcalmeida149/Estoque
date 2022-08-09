package entities;

public class Product {
	public String name;
	public double Price;
	public int quantity;
	
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
				+ String.format("%.2f",TotalValueInStock());
	}
}