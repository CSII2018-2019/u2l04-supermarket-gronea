import javax.swing.JOptionPane;

public class U2L04Supermarket {

	public static void main(String[] args) {
		Produce produce1 = new Produce();
		CannedGoods canned1 = new CannedGoods();
		Flowers flower1 = new Flowers();
		
		System.out.println("Produce: " + produce1 + " with remaining stock of " + produce1.getStock());
		System.out.println("Canned Goods: " + canned1 + " with remaining stock of " + canned1.getStock());
		System.out.println("Flowers: " + flower1 + " with remaining stock of " + flower1.getStock());
		
		String name = JOptionPane.showInputDialog("What Produce would you like to buy (apple or orange): ");
		String input = JOptionPane.showInputDialog("How many are you buying: ");
		int quant = Integer.parseInt(input);
		String input2 = JOptionPane.showInputDialog("How much does it weigh: ");
		double weight = Integer.parseInt(input2);
		Produce produce2 = new Produce(name, quant, (produce1.getStock()-quant), weight);
		
		String name2 = JOptionPane.showInputDialog("What Produce would you like to buy (apple or orange): ");
		String input3 = JOptionPane.showInputDialog("How many are you buying: ");
		int quant2 = Integer.parseInt(input3);
		CannedGoods canned2 = new CannedGoods(name2, quant2, (canned1.getStock()-quant));
		
		String name3 = JOptionPane.showInputDialog("What Produce would you like to buy (apple or orange): ");
		String input4 = JOptionPane.showInputDialog("How many are you buying: ");
		int quant3 = Integer.parseInt(input4);
		String color = JOptionPane.showInputDialog("What color is it: ");
		String input6 = JOptionPane.showInputDialog("Is it an arrangement: ");
		if (input6 == "yes"||input6 =="Yes") {
			char var = 'y';
		}else {
			char var = 'z';
		}
		Flowers flower2 = new Flowers (name3, quant3, (flower1.getStock()-quant3), color, var );
		System.out.println("Produce: " + produce2 + ". \n Canned Goods: " + canned2 
				+ ". \n Flowers: " + flower2 + ".");
	}

}
