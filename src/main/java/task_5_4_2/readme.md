# Task 2: creating a simple class and writing tests for it following the TDD approach**

Your task is to create a Java class called `ShoppingCart` that can manage items in a shopping cart. The class should allow users to add items, remove items, and calculate the total cost of items in the cart.

## Steps

1. **Write Tests:** Begin by writing tests for the `ShoppingCart` class. Consider test cases for adding items, removing items, and calculating the total cost.

2. **Implement the Class:** Create the `ShoppingCart` class with methods to add items, remove items, and calculate the total cost.

3. **Run Tests:** Run your test suite. Initially, the tests should fail because you haven't implemented the class yet.

4. **Implement the Methods:** Implement the methods in the `ShoppingCart` class to satisfy the test cases you've written.

5. **Refactor (if needed):** Once your tests pass, you can refactor your code for better readability and maintainability while ensuring that all tests still pass.

## Example

Here's a sample set of test cases you might consider:

```java
public class ShoppingCartTest {
    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();
        
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        
        assertEquals(2, cart.getItemCount());
    }
    
    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();
        
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.removeItem("Apple");
        
        assertEquals(1, cart.getItemCount());
    }
    
    @Test
    public void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();
        
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);
        
        assertEquals(2.25, cart.calculateTotal(), 0.01);
    }
}
```

## Your Task

1. Begin by writing the test cases in the `ShoppingCartTest` class. These tests should guide you on what methods the `ShoppingCart` class should have.

2. Implement the `ShoppingCart` class with the methods to add items, remove items, and calculate the total cost.

3. Run your tests frequently to make sure you're making progress.

Remember that this exercise follows the TDD approach: you start by writing tests, then implement the functionality to make the tests pass, and finally refactor your code if necessary.