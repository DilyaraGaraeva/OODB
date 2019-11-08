import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

//public class Shop {
//    private String name;
//
//    private List<Worker> workers;
//
//    private List<Buyer> buyers;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setWorkers(List<Worker> workers) {
//        this.workers = workers;
//    }
//
//    @XmlElementWrapper(name = "buyers")
//    @XmlElement(name = "buyer")
//
//
//    public List<Buyer> getBuyers() {
//        return buyers;
//    }
//
//    public void setBuyers(List<Buyer> buyers) {
//        this.buyers = buyers;
//    }
//
//    public void addWorker(Worker worker) {
//        if (!workers.contains(worker)) {
//            workers.add(worker);
//        }
//    }
//
//    public void addBuyer(Buyer buyer) {
//        if (!buyers.contains(buyer)) {
//            buyers.add(buyer);
//        }
//    }

@XmlRootElement(name = "shop")
public class Shop {

    private String name;

    private List<Buyer> buyers;

    private List<Purchase> purchases;

    private List<ShopAccount> shopAccounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElementWrapper(name = "clients")
    @XmlElement(name = "client")
    public List<Buyer> getBuyers() {
        return buyers;
    }

    public void setBuyers(List<Buyer> buyers) {
        this.buyers = buyers;
    }

    @XmlElementWrapper(name = "transactions")
    @XmlElement(name = "transaction")
    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    @XmlElementWrapper(name = "shopAccounts")
    @XmlElement(name = "shopccount")
    public List<ShopAccount> getShopAccounts() {
        return shopAccounts;
    }

    public void setShopAccounts(List<ShopAccount> bankAccounts) {
        this.shopAccounts = bankAccounts;
    }

    @Override
    public String toString() {
        return "Bank: " +
                "name='" + name + '\n' +
                ", buyers=" + buyers + '\n' +
                ", purchases=" + purchases + '\n' +
                ", bankAccounts=" + shopAccounts;
    }}
