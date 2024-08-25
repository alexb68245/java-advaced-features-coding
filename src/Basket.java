public class Basket {

    private static int countOfItems = 0;
    private static final int MAX_ITEMS = 3;

    public void addToBasket() throws BasketFullException{
        if (countOfItems >= MAX_ITEMS) {
            throw new BasketFullException("Cannot add more than " + MAX_ITEMS + " items");
        }else {
            countOfItems++;
            System.out.println("item added to the basket");
        }

    }

    public void removeFromBasket() throws BasketEmptyException {
        if(countOfItems <= 0) {
            throw new BasketEmptyException("Cannot remove items");
        }else {
            countOfItems--;
            System.out.println("item removed from the basket");
        }

    }

    public static void main(String[] args) {
        Basket basket = new Basket();
        try {
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
        }catch (BasketFullException e) {
            System.out.println(countOfItems);
            System.out.println(e.getMessage());
        }


        try {
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
        } catch (BasketEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
