public class Cone extends ThreeDShape {

    private double r;  //radius
    private double h;  //height

    public Cone(double r, double h ) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return (Math.PI * r * r * h) / 3;
    }

    @Override
    public void fill(double d) {

        if ( calculateVolume() > d ) {
            System.out.println("Not pouring enough water! ");
        } else if ( calculateVolume() < d ) {
            System.out.println("There is too much water! ");
        } else if ( calculateVolume() == d) {
            System.out.println("The figure is full! ");
        }
    }

}
