package code;

public class NoDiscount implements DiscountStrategy {
    public NoDiscount() {
    }

    public double pay(double price) {
        return price;
    }

    public String discountInfo() {
        return "普通会员";
    }
}