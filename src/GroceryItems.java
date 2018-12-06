
public class GroceryItems {
	private double totalCost;
	
	public void GroceryItems(double c) {
		setTotalCost(c);
		
	}


	private void setTotalCost(double c) {
		if(c >= 0) {
			totalCost += c;
		}
		
	}
	public double getTotalCost() {
		return totalCost;
	}
	
    public String toString(){
        return "The overall cost is $" + totalCost + ".";
    }
}
