public class TestGoods {
    public static void main(String[] args) {
        Food food = new Food("Chocolate Bar", 1.50, 250);
        Toy toy = new Toy("Lego Set", 49.99, 8);
        Book book = new Book("The Hobbit", 14.95, "J.R.R. Tolkien");

        System.out.println("--- Food Details ---");
        food.display();
        System.out.println("(Food is not taxable)");

        System.out.println("\n--- Toy Details ---");
        toy.display();
        System.out.println("Tax: $" + String.format("%.2f", toy.calculateTax()));

        System.out.println("\n--- Book Details ---");
        book.display();
        System.out.println("Tax: $" + String.format("%.2f", book.calculateTax()));
    }
}