package test5;

public class Phones {
    private String brand;
    private String color;
    private int price;

    public Phones() {
    }

    public Phones(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Phones{brand = " + brand + ", color = " + color + ", price = " + price + "}";
    }
}
