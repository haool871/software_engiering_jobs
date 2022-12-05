package code;

public class Server {
    private DiscountStrategy strategy;

    public Server() {
    }

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(double price) {
        return this.strategy.pay(price);
    }

    public String getInfo() {
        return this.strategy.discountInfo();
    }
}
