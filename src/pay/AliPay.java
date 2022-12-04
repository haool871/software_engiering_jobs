package pay;

public class AliPay implements PayTool{
    @Override
    public boolean pay(String tool, double value, String to, String from) {
        System.out.println("pay by aliPay from:"+from+"\tto:"+to+"\tvalue:"+value);
        return true;
    }
}
