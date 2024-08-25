public class Rectangle extends Shape{
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * (length + height));
    }

    @Override
    public double calculateArea() {
        return (length * height);
    }
}
