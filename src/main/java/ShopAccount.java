import javax.xml.bind.annotation.XmlElement;

public class ShopAccount {
    private long accountNumber;

    private double balance;

    public ShopAccount(long accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public ShopAccount() {
    }

    @XmlElement(name = "accountNumber")
    long getAccountNumber() {
        return accountNumber;
    }
    @XmlElement(name = "balance")
    double getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    protected void increaseBalance(double cash) {
        this.balance += cash;
    }

    protected boolean reduceBalance(double cash) {
        if (balance < cash) {
            return false;
        } else {
            this.balance -= cash;
            return true;
        }
    }

    @Override
    public String toString() {
        return "ShopAccount:" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '\n';
    }
}
