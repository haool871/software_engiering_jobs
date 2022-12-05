package code;

public class Coupon implements DiscountStrategy {
    public Coupon() {
    }

    public double pay(double price) {
        return price - 5;
    }

    public String discountInfo() {
        return "使用优惠券";
    }
}
