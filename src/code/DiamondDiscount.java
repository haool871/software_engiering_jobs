package code;

public class DiamondDiscount implements DiscountStrategy {
    public DiamondDiscount() {
    }

    public double pay(double price) {
        return price * 0.85;
    }

    public String discountInfo() {
        return "钻石会员";
    }
}
