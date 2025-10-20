public class Product {
    // Attributes
    private String id;
    private String name;
    private double price;
    private double discount;

    // Constructor
    public Product(String id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Getter methods
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public double getDiscount() {
        return discount;
    }

    // Method price After Discount
    public double priceAfterDiscount() {
        return price - (price * discount / 100);
    }

//    method final price
    public double finalPrice() {
        double afterDiscount = priceAfterDiscount();
        return afterDiscount + (afterDiscount * 0.05);
    }

}
