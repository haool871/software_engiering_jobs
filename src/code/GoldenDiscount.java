package code;

public class GoldenDiscount implements DiscountStrategy {
    public GoldenDiscount() {
    }

    public double pay(double price) {
        return price * 0.9;
    }

    public String discountInfo() {
        return "黄金会员";
    }
}

