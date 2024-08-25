public class Hexagon extends Shape{
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return (6 * side);
    }

    @Override
    public double calculateArea() {
        return ((3 * Math.sqrt(3.0) * side * side) / 2);
    }
}