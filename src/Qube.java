public class Qube extends ThreeDShape {

    private double aa;

    public Qube(double aa) {
        this.aa = aa;
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
        return aa * aa * aa;
    }

    @Override
    public void fill (double d) {

        if ( calculateVolume() > d ) {
            System.out.println("Not pouring enough water! ");
        } else if ( calculateVolume() < d ) {
            System.out.println("There is too much water! ");
        } else if ( calculateVolume() == d) {
            System.out.println("The figure is full! ");
        }
    }

}