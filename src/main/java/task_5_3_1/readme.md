# Task 1: Design a class when JUnit tests are available**

You are given the following unit tests for a pencil class:
```Java
class PenTest {
    @Test
    void canDrawDefault() {
        Pen p = new Pen();
        assertEquals("", p.draw());
        p.capOff();
        assertEquals("Drawing red", p.draw());
        p.capOn();
        assertEquals("", p.draw());
    }

    @Test
    void canDrawSelectedColor() {
        Pen p = new Pen(Pen.Color.BLUE);
        assertEquals("", p.draw());
        p.capOff();
        assertEquals("Drawing blue", p.draw());
        p.capOn();
        assertEquals("", p.draw());
    }

    @Test
    void canChangeColor() {
        Pen p = new Pen(Pen.Color.RED);
        p.capOff();
        assertEquals("Drawing red", p.draw());
        p.changeColor(Pen.Color.GREEN);
        assertEquals("Drawing red", p.draw());

        p.capOn();
        p.changeColor(Pen.Color.GREEN);
        assertEquals("", p.draw());
        p.capOff();
        assertEquals("Drawing green", p.draw());
    }
}
```

Your task is to design the actual class `Pen`. Here is a skeleton for the `Pen` class:
```Java
public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }
    
    // your code here
}
```