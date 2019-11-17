package home.task6;

import java.util.ArrayList;

public class Backpack {

    private double capacity;
    private double totalPrice;
    private double totalWeight;
    private ArrayList<Item> items;

    public Backpack(double capacity) {
        this.capacity = capacity;
        items = new ArrayList<Item>();
    }

    public boolean PutItem(Item item){
        if(totalWeight+item.getWeight() <= capacity){
            items.add(item);
            totalWeight+=item.getWeight();
            totalPrice+=item.getPrice();
            return true;
        } else {
            for (Item itemi:items) {
                if(itemi.getPerWeight() <= item.getPerWeight()){
                    items.remove(itemi);
                    totalWeight-=itemi.getWeight();
                    totalPrice-=itemi.getPrice();
                    return PutItem(item);
                }
            }
        }
        return false;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
