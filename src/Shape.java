public abstract class Shape {
    public abstract double calculatePerimeter();
    public abstract double calculateArea();

    public static void main(String[] args) {
        Triangle triangle = new Triangle(6, 8, 10);
        Rectangle rectangle = new Rectangle(30, 17);
        Hexagon hexagon = new Hexagon(9);
        System.out.println("Triangle Perimeter: " +triangle.calculatePerimeter());
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter() );
        System.out.println("Rectangle Area: " + rectangle.calculateArea() );
        System.out.println("Hexagon Perimeter: " + hexagon.calculatePerimeter() );
        System.out.println("Hexagon Area: " + hexagon.calculateArea() );
    }
}