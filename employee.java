package task3;

public class employee {
	public int empId;
	public String name;
	public double salary;

	    public employee(int empId, String name, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	    }

	    public double calcTax() {
	        double incomeTax = 0;
			return salary * incomeTax;
	    }
	}


