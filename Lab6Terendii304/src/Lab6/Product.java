package Lab6;

public abstract class Product implements Comparable<Product> {
    protected String name;
    protected double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }
    public String toString() {
        return "Product{name='" + name + "', price=" + price + '}';
    }
}
