public class Book extends Goods implements Taxable {
    private String author;

    public Book(String description, double price, String author) {
        super(description, price);
        this.author = author;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Author: " + author);
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }
}