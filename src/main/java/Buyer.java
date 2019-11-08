import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Buyer extends User {
    private String address;
    private List<Basket> orders;


    public Buyer(String firstName, String lastName, String phoneNumber, String email, String address) {
        super(firstName, lastName, phoneNumber, email);
        this.address = address;
    }

    public Buyer(String name, String lastName, String phoneNumber, String email) {

    }


    private List<ShopAccount>accounts;


    @XmlElementWrapper(name = "accounts")
    @XmlElement(name = "account")
    public List<ShopAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<ShopAccount> accounts) {
        this.accounts = accounts;
    }
    @Override
    public String toString() {
        return "Buyer: " + getLastName() +
                ", accounts=" + accounts +
                '\n';
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
