package task3;

public class Library {
   
	 public Book[] books;
	 public Library(int size) {
	        this.books = new Book[size];
	    }

	  public void addBook(Book book) {
	        for (int i = 0; i < books.length; i++) {
	            if (books[i] == null) {
	                books[i] = book;
	                System.out.println("Book added successfully.");
	                return;
	            }
	        }
	        System.out.println("Library is full. Cannot add more books.");
	    }

	  public void replaceBook(int bookID, String title, String author) {
	        for (int i = 0; i < books.length; i++) {
	            if (books[i] != null && books[i].getBookID() == bookID) {
	                books[i] = new Book(bookID, title, author);
	                System.out.println("Book replaced successfully.");
	                return;
         }
	     }
	       System.out.println("Book with ID " + bookID + " not found in the library.");
	    }

	  public void displayBooks() {
	        System.out.println("Books in the library:");
	        for (Book book : books) {
	            if (book != null) {
	                System.out.println(book);
	            }
	        }
	    }
	}
 