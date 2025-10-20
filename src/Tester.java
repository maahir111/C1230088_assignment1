public class Tester {
    public static void main(String[] args) {
        Product laptop = new Product("P001", "Laptop", 500.0, 10);
        Product phone = new Product("P002", "Phone", 300.0, 5);

        System.out.println("Detailed Calculation:");
        System.out.println("Laptop original: " + laptop.getPrice() +
                ", after discount: " + laptop.priceAfterDiscount() +
                ", final with VAT: " + laptop.finalPrice());
        System.out.println("Phone original: " + phone.getPrice() +
                ", after discount: " + phone.priceAfterDiscount() +
                ", final with VAT: " + phone.finalPrice());

    }
}
