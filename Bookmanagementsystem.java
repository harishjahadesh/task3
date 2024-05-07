package task3;

import java.util.Scanner;

public class Bookmanagementsystem {
	 public static void main(String[] args) {
	        Scanner scanner1 = new Scanner(System.in);
	        Library library = new Library(5); 

	        while (true) {
	            System.out.println("Library Management System Menu:");
	            System.out.println("1. Add a book");
	            System.out.println("2. Replace a book");
	            System.out.println("3. Display all books");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner1.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book ID: ");
	                    int id = scanner1.nextInt();
	                    scanner1.nextLine(); // Consume newline
	                    System.out.print("Enter Title: ");
	                    String title = scanner1.nextLine();
	                    System.out.print("Enter Author: ");
	                    String author = scanner1.nextLine();
	                    library.addBook(new Book(id, title, author));
	                    break;
	                case 2:
	                    System.out.print("Enter Book ID to replace: ");
	                    int replaceID = scanner1.nextInt();
	                    scanner1.nextLine(); // Consume newline
	                    System.out.print("Enter New Title: ");
	                    String newTitle = scanner1.nextLine();
	                    System.out.print("Enter New Author: ");
	                    String newAuthor = scanner1.nextLine();
	                    library.replaceBook(replaceID, newTitle, newAuthor);
	                    break;
	                case 3:
	                    library.displayBooks();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	            }
	        }
	    }
	}