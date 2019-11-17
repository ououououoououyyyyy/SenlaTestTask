package home.task6;

import java.util.List;

public class task6 {
    public static void main(String[] args) {
        Item milk = new Item(1,1.39);
        Item sweats = new Item(1,2.42);
        Item phone = new Item(0.3,100);
        Item socks = new Item(0.1,2.32);
        Item book = new Item(0.56,15.54);
        Item hoodie = new Item(0.42,34.5);
        Backpack backpack = new Backpack(2);
        backpack.PutItem(milk);
        backpack.PutItem(sweats);
        backpack.PutItem(phone);
        backpack.PutItem(socks);
        backpack.PutItem(book);
        backpack.PutItem(hoodie);
        System.out.println(backpack);
    }
}
