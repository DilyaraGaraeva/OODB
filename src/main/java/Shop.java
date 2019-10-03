import java.util.List;

public class Shop {
    private String name;

    private List<Worker> workers;

    private List<Buyer> buyers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public List<Buyer> getBuyers() {
        return buyers;
    }

    public void setBuyers(List<Buyer> buyers) {
        this.buyers = buyers;
    }

    public void addWorker(Worker worker) {
        if (!workers.contains(worker)) {
            workers.add(worker);
        }
    }

    public void addBuyer(Buyer buyer) {
        if (!buyers.contains(buyer)) {
            buyers.add(buyer);
        }
    }

}
