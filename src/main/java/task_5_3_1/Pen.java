package task_5_3_1;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    private boolean capIsOn = true;
    private Color color = Color.RED;

    public Pen() {

    }

    public Pen(Color color) {
        this.color = color;
    }

    public void changeColor(Color color) {
        if(!capIsOn) return;
        this.color = color;
    }

    public void capOff() {
        capIsOn = false;
    }

    public String draw() {
        if (capIsOn) return "";
        return "Drawing " + color;
    }

    public void capOn() {
        capIsOn = true;
    }
}