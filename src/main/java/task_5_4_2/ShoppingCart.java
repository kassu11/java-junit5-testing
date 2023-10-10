package task_5_4_2;

import java.util.HashMap;

public class ShoppingCart {
    private HashMap<String, Double> items = new HashMap<>();

    public void add(String item, double price) {
        items.put(item, price);
    }

    public void remove(String item) {
        items.remove(item);
    }

    public double totalCost() {
        double total = 0;
        for(Double price : items.values()) {
            total += price;
        }
        return total;
    }
}
