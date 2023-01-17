package ex03.test02;

public class Book {
	String bookName;
	int bookPrice;
	double bookDiscountRato;
	
	public Book() {
		super();
	}

	public Book(String bookName, int bookPrice, double bookDiscountRato) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRato = bookDiscountRato;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRato() {
		return bookDiscountRato;
	}

	public void setBookDiscountRato(double bookDiscountRato) {
		this.bookDiscountRato = bookDiscountRato;
	}

	public double getDiscountBookPrice() {
		double discountPrice =bookPrice+(bookPrice*bookDiscountRato); 
		return discountPrice;
	}
	
	

}
