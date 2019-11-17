package home.task6;

public class Item {

    private double weight;
    private double price;
    private double perWeight;

    public Item(double weight, double price) {
        this.weight = weight;
        this.price = price;
        this.perWeight = price/weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPerWeight() {
        return perWeight;
    }

    public void setPerWeight(double perWeight) {
        this.perWeight = perWeight;
    }
}
