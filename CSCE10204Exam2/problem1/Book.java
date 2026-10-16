package problem1;

public class Book {
	private String title;
	private String author;
	private double price;
	
	public Book(){
		this.title = "Unknown";
		this.author = "Unknown";
		this.price = 0.00;
	}
	
	public Book(String title, String author, double price){
		
		setTitle(title);
		setAuthor(author);
		setPrice(price);
	}
	
	public void show() {
		System.out.println(this.title);
		System.out.println(this.author);
		System.out.println(this.price);
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title != "") {
		this.title = title;
		}else {
			this.title = "Unknown";
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if(author != "") {
			this.author = author;
			}else {
				this.author = "Unknown";
			}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		
		if(d >=0.00 && d<=200.00) {
		this.price = d;
		}
		else {
			this.price = 0.00;
		}
	}

}
