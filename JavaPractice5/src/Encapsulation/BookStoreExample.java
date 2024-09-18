package Encapsulation;

class Book {
    private String title;
    private String author;
    private int price;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
    	if(price>0) {
    		  this.price = price;
    	}else {
    		System.out.println("Invalid price");
    	}
    }

    int applyDiscount(int percent) {
        return getPrice() - (getPrice() * percent / 100);
    }
}

public class BookStoreExample {
    public static void main(String[] args) {

        Book book = new Book();
        book.setAuthor("Kalki");
        book.setTitle("Ponniyin Selvan");
        book.setPrice(2000);

        int discountPercent = 15;
        int discountedPrice = book.applyDiscount(discountPercent);

        System.out.println(book.getTitle() + " written by " + book.getAuthor() + " is available for sale at Rs. " + discountedPrice + ".");
        System.out.println("Discount of " + discountPercent + "% is applied.");
    }
}
