package task3;

public class product {
	 public static final double SALES_TAX = 0;
	 public int pid;
	 public double price;
	 public int quantity;
	 
		public void Product(int pid, double price, int quantity) {
	        this.pid = pid;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public double calcTax() {
	        return price * SALES_TAX;
	    }
	}
}
