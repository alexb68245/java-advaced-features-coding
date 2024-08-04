public class Parcel implements Validator{

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength,  float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    @Override
    public boolean validate(Parcel input) {
        if (input.xLength + input.yLength + input.zLength <= 300){
            if (input.xLength >= 30 ){
                if (input.yLength >= 30){
                    if (input.zLength >= 30){
                        if (input.weight > 30.0){
                            System.out.println("Parcel can not weight more than 30");
                            return false;
                        }else if(input.weight <= 30.0 && input.weight > 15.0){
                            input.isExpress = false;
                        }else if (input.weight <= 15.0) {
                            input.isExpress = true;
                        }
                    }else {
                        System.out.println("The length of z can not be less than 30");
                        return false;
                    }
                }else {
                    System.out.println("The length of y can not be less than 30");
                    return false;
                }
            }else {
                System.out.println("The length of x can not be less than 30");
                return false;
            }
        }
        else if (input.xLength + input.yLength + input.zLength > 300){
            System.out.println("The sum of dimensions can not be more than 300");
            return false;
        }


        System.out.println(input.toString());
        return true;
        }

    @Override
    public String toString() {
        return "Parcel{" +
                "xLength=" + xLength +
                ", yLength=" + yLength +
                ", zLength=" + zLength +
                ", weight=" + weight +
                ", isExpress=" + isExpress +
                '}';
    }
}
