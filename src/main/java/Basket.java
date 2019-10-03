public class Basket {
    public static int currentOrderNumber = 0;

    private int orderNumber;

    private double sum;

    Basket(int orderNumber) {
        this.orderNumber = orderNumber;
        this.sum = 0;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getSum() {
        return sum;
    }

    protected void addOrder (double price) {
        this.sum += price;
    }

    protected void deleteOrder (double price) {
        this.sum -= price;
    }




}
