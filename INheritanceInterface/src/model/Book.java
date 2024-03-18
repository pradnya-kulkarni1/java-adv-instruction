package model;

public class Book extends product implements Printable{
	private String author;
	
	public Book(String code, String description, double price, String author) {
		super(code, description, price);
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(getDescription() + " by "+ author + " : "+ price);
	}
	


}
