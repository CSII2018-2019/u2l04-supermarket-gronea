
public class Produce extends GroceryItems{
	private double price;
	private String name;
	private int stock;
	private double weight;
	
	public Produce (String n, int q, int s, double w) {
		setName(n);
		setStock(s);
		setWeight(w);
		setPrice(q);
	}
	
	public Produce () {
		setStock(7);
	}
	
	private void setName(String n) {
		if (name == "Apple"|| name == "apple") {
			name = n;
		}else if (name == "Orange"||name== "orange") {
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
	
	private void setWeight(double w) {
		if (w >= 0) {
			weight = w;
		}		
	}
	public double getWeight() {
		return weight;
	}
	
	private void setPrice(int q) {
		if (stock >= 0) {
			price = (weight * 3)*.15;
			
		}
	}
	public double getPrice() {
		return price;
	}
}
