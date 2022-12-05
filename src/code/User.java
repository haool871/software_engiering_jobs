package code;

public class User {
    public User() {
    }

    public void pay(double price, DiscountStrategy... strategy) {
        Server server = new Server();
        double newPrice = price;
        DiscountStrategy[] var10 = strategy;
        int var9 = strategy.length;

        for(int var8 = 0; var8 < var9; ++var8) {
            DiscountStrategy str = var10[var8];
            server.setStrategy(str);
            newPrice = server.getPrice(newPrice);
        }

        System.out.printf("%s：您需要支付%.2f元%n", server.getInfo(), newPrice);
    }
}

