
public class Flowers {
	private String name;
	private int stock;
	private double price;
	private String color;
	
	public Flowers (String n, int q, int s, String c, char a) {
		setName(n);
		setStock(s);
		setcolor(c);
		setPrice(q, a);
	}
	
	public Flowers () {
		setStock(4);
	}
	
	private void setName(String n) {
		name = n;
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
	
	private void setcolor(String c) {
		color = c;
	}
	public String getcolor() {
		return color;
	}
	
	private void setPrice(int q, char a) {
		if (a == 'y' || a == 'Y') {
			price = (q* 10.00) + 5.00;
		}else {
			price = q * 10.00;
		}
	}
	public double getPrice() {
		return price;
	}
}
