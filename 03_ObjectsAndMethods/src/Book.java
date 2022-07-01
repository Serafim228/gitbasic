
public class Book {
	private String name, autor;
	private int amountPages, numberISBN;
	
	
	public Book (String name, String autor, int amountPages, int numberISBN) {
		this.name = name;
		this.amountPages = amountPages;
		this.autor = autor;
		this.numberISBN = numberISBN;
	}
	

	public String getAutor() {
		return autor;
	}


	public String getName() {
		return name;
	}


	public int getAmountPages() {
		return amountPages;
	}


	public int getNumberISBN() {
		return numberISBN;
	}
}
