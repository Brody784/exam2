package problem1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		String title;
		String author;
		double price;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter Title, Author, and price.");
		title = scanner.nextLine();
		author = scanner.nextLine();
		price = scanner.nextDouble();
		
		Book book = new Book(title, author, price);
		
		book.show();
		
	}

}
