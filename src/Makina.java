import java.util.Map;

public enum Makina {
    FERRARI(1000_000, 1_000),
    PORSCHE(100000, 2_000),
    MERCEDES(50_000, 900),
    BMW(30_000, 700),
    OPEL(6_000, 800),
    FIAT(5_000, 500),
    TOYOTA(7_000, 400);

    private double price;
    private int power;

    Makina(double price, int power) {
        this.price = price;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isRegular(){
        return getPrice() <= 50000;
    }

    public boolean isPremium(){
        return !isRegular();
    }

    public boolean isFasterThan(Makina makina){
        Makina bmw = Makina.BMW;
        return bmw.getPower() >= makina.getPower();
    }

    public static void main(String[] args) {
        Makina makina = Makina.PORSCHE;
        System.out.println(makina.isFasterThan(makina));
    }
}
