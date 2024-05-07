package task3;

import java.util.Scanner;

public class Drivemain {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Employee Information:");
	        System.out.print("Employee ID: ");
	        int empId = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.print("Employee Name: ");
	        String empName = scanner.nextLine();
	        System.out.print("Employee Salary: ");
	        double empSalary = scanner.nextDouble();
	        employee employee = new employee(empId, empName, empSalary);
	        System.out.println("\nEnter Product Information:");
	        System.out.print("Product ID: ");
	        int pid = scanner.nextInt();
	        System.out.print("Product Price: ");
	        double price = scanner.nextDouble();
	        System.out.print("Product Quantity: ");
	        int quantity = scanner.nextInt();
	        product product = new product();
	
	        System.out.println("\nIncome Tax for Employee " + empName + ": " + employee.calcTax());
	        System.out.println("Sales Tax for Product ID " + pid + ": " + product.calcTax());

	        scanner.close();
	    }
}
