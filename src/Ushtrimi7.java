public class Ushtrimi7 {

    private static int size;
    private static int currentSize = 0;

    public Ushtrimi7(int size) {
        this.size = size;
    }

    public static int loadBullet(int bullet){
        if (currentSize + bullet <= size){
                currentSize += bullet;
        }else {
            System.out.println("We can not add " + bullet +
                    " bullets because capacity is met");
        }
        return currentSize;
    }

    public static boolean isLoaded(){
        /*if (currentSize == 0){
            return false;
        }else {
            return true;
        }*/
        return currentSize > 0;
    }

    public static int shot(){
        if (currentSize != 0) {
            currentSize--;
            if (currentSize == 1){
                System.out.println("This is your last bullet");
            }
        }else{
            System.out.println("There are no bullets");
        }
        return currentSize;
    }

    public static void main(String[] args) {
        Ushtrimi7 ushtrimi7 = new Ushtrimi7(10);
        System.out.println(loadBullet(5));
        System.out.println(isLoaded());
        System.out.println(loadBullet(8));
        System.out.println(shot());
        System.out.println(loadBullet(1));
        System.out.println(shot());
        System.out.println(shot());
        System.out.println(shot());
        System.out.println(shot());
        System.out.println(shot());
        System.out.println(isLoaded());
        System.out.println(shot());
    }
}
