public abstract class ThreeDShape extends Shape implements Fillable {

    abstract double calculateVolume();

    public static void main(String[] args) {

        ThreeDShape cone = new Cone(5,12);
        System.out.println("The volume of cone is : " + cone.calculateVolume());
        System.out.println("We can not calculate the area of cone! " + cone.calculateArea());
        System.out.println("We can not calculate the perimeter of cone! "+ cone.calculatePerimeter());
        cone.fill(50);

        ThreeDShape qube = new Qube(10);
        System.out.println("The volume of cube is : " + qube.calculateVolume());
        System.out.println("We can not calculate the area of cube! " + qube.calculateArea());
        System.out.println("We can not calculate the perimeter of cube! "+ qube.calculatePerimeter());
        qube.fill(60);
    }
}