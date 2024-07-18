package core.basesyntax;

public class Figure implements AreaCalculable, Draw {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String draw() {
        return "color: " + color;
    }
}
