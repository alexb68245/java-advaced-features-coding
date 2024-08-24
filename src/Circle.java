
public class Circle implements Movable, Resizable{

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt(
                Math.pow(point.getX() - center.getX(), 2) +
                        Math.pow(point.getY() - center.getY(),2));
    }

    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    public double getArea(){
        return Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        //double centerX = center.getX() +moveDirection.getX();
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        center.setX(center.getX() * resizeFactor);
        center.setY(center.getY() * resizeFactor);
        point.setX(center.getX() * resizeFactor);
        point.setY(center.getY() * resizeFactor);
    }

    public static void main(String[] args) {
        Point2D center = new Point2D(5,6);
        Point2D point = new Point2D(10,12);
        Circle circle = new Circle(center, point);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("X of center is: " + circle.getCenter().getX());
        System.out.println("Y of center is: " + circle.getCenter().getY());
        MoveDirection moveDirection = new MoveDirection(4,4);
        circle.move(moveDirection);
        System.out.println("X of point after move is: " + circle.getPoint().getX());
        System.out.println("Y of point after moe is: " + circle.getPoint().getY());
        System.out.println("X of center after move is: " + circle.getCenter().getX());
        System.out.println("Y of center after move is: " + circle.getCenter().getY());
        //circle.resize(0.5);
        //System.out.println("Perimeter after resize with factor 0.5 is: " + circle.getPerimeter());
        //System.out.println("Radius: " + circle.getRadius());
        circle.resize(1.5);
        System.out.println("Perimeter after resize with factor 1.5 is: " + circle.getPerimeter());
        System.out.println("Radius: " + circle.getRadius());

    }



}
