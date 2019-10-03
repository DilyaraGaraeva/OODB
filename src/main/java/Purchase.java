import java.util.Date;

public class Purchase {
    private Basket basket;
    private Worker worker;
    private Date orderDate;
    private Buyer buyer;
    private double sum;

    public Purchase(Basket basket, Worker worker, Buyer buyer, double sum) {
        this.basket = basket;
        this.worker = worker;
        this.orderDate = new Date();
        this.buyer = buyer;
        this.sum = sum;
        if (sum > 0) {
            toPay(sum);
        }
    }

    private void toPay(double sum){
        buyer.toPay(sum);
    }


    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
