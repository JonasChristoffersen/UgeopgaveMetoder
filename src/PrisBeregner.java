public class PrisBeregner {
    public double applyDiscount(double price, double discountPercent) {
        return price * (1 - discountPercent / 100);
    }

    public double addTax(double price) {
        return price *= 1.25;
    }

    public double calculateFinalPrice(double basePrice, double discount) {
        double priceAfterDiscount = applyDiscount(basePrice, discount);
        addTax(priceAfterDiscount);
        return addTax(priceAfterDiscount);
    }

    public void main() {
        System.out.println("Slutpris med 20% rabat: " + calculateFinalPrice(500, 20));
    }
}
