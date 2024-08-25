public class Basket {
    private int items;
    private static final int MAX_ITEMS = 3;

    public Basket() {
        this.items = 0;
    }

    public void addToBasket() {
        if (items >= MAX_ITEMS) {
            throw new BasketFullException("The basket is full.");
        }
        items++;
        System.out.println("Item added. Current number of items: " + items);
    }

    public void removeFromBasket() {
        if (items <= 0) {
            throw new BasketEmptyException("Cannot remove items, the basket is empty.");
        }
        items--;
        System.out.println("Item removed. Current number of items: " + items);
    }

    public static void main(String[] args) {
        Basket basket = new Basket();

        try {
            basket.addToBasket();
            basket.addToBasket();

        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            basket.removeFromBasket();

        } catch (BasketEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
