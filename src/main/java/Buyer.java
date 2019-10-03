import java.util.List;

public class Buyer extends User {
    private String address;
    private List<Basket> orders;


    public Buyer(String firstName, String lastName, String phoneNumber, String email, String address) {
        super(firstName, lastName, phoneNumber, email);
        this.address = address;
    }


    public int sentToBasket(double price){
        Basket basket = null;
        basket.addOrder(price);
        int orderNumber = Basket.currentOrderNumber++;
        orders.add(new Basket(orderNumber));
        return orderNumber;
    }


    public void toPay (double sum){
        Basket basket = null;
        basket.getSum();
    }
}
