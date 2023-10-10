package task_5_4_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void add() {
        ShoppingCart c = new ShoppingCart();
        c.add("Banana", 5);
        assertEquals(5, c.totalCost());
        c.add("Orange", 3);
        assertEquals(8, c.totalCost());
        c.add("Juice", 4);
        assertEquals(12, c.totalCost());
        c.add("Juice", 12);
        assertEquals(20, c.totalCost());
    }

    @Test
    void remove() {
        ShoppingCart c = new ShoppingCart();
        c.add("Banana", 5);
        c.add("Orange", 3);
        c.add("Juice", 4);

        assertEquals(12, c.totalCost());
        c.remove("Banana");
        assertEquals(7, c.totalCost());
        c.remove("Orange");
        assertEquals(4, c.totalCost());
        c.remove("Juice");
        assertEquals(0, c.totalCost());
    }

    @Test
    void totalCost() {
        ShoppingCart c = new ShoppingCart();
        assertEquals(0, c.totalCost());
        c.add("Banana", 5);
        assertEquals(5, c.totalCost());
        c.add("Orange", 3);
        assertEquals(8, c.totalCost());
        c.add("Juice", 4);
        assertEquals(12, c.totalCost());
        c.add("Juice", 12);
        assertEquals(20, c.totalCost());
        c.remove("Banana");
        assertEquals(15, c.totalCost());
        c.remove("Orange");
        assertEquals(12, c.totalCost());
        c.remove("Juice");
        assertEquals(0, c.totalCost());
        c.remove("Juice");
        assertEquals(0, c.totalCost());
    }
}