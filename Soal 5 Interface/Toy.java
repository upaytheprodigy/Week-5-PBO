public class Toy extends Goods implements Taxable {
    private int minimumAge;

    public Toy(String description, double price, int minimumAge) {
        super(description, price);
        this.minimumAge = minimumAge;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Minimum Age: " + minimumAge);
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }
}