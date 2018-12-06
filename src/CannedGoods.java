
public class CannedGoods extends GroceryItems{
	private double price;
	private String name;
	private int stock;
	
	public CannedGoods(String n, int q, int s) {
		setName(n);
		setStock(s);
		setPrice(q);
	}
	
	public CannedGoods () {
		setStock(10);
	}
	private void setName(String n) {
		if (n == "Tomato"|| n == "tomato") {
			name = n;
		}else if (n == "Chicken"||n == "chicken") {
			name = n;
		}else if(n == "Wedding"||n == "wedding") {
			name = n;
		}else {
			System.out.println("We do not have that product of soup."
					+ "\nNo soup is bought.");
			name = "z";
		}
	}
	public String getName() {
		return name;
	}
	
	private void setStock(int s) {
		if(s >= 0 && name != "z") {
			stock = s;
		}else {
			System.out.println("Sorry, but we do not have that number of " + name + "in stock."
					+ "\nNo change will be made.");
		}
	}
	public int getStock() {
		return stock;
	}
	
	private void setPrice(int q) {
		if (stock >=0) {
			price = q * 3.50;
		}
	}
	
	public double getPrice() {
		return price;
	}
}
