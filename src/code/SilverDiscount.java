package code;

public class SilverDiscount implements DiscountStrategy {
    public SilverDiscount() {
    }

    public double pay(double price) {
        return price * 0.95;
    }

    public String discountInfo() {
        return "白银会员";
    }
}

