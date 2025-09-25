public interface Taxable {
    double taxRate = 0.06; // Konstanta pajak 6%
    double calculateTax();   // Metode abstrak untuk menghitung pajak
}