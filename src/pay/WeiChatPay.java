package pay;

public class WeiChatPay implements PayTool{
    @Override
    public boolean pay(String tool, double value, String to, String from) {
        System.out.println("pay by WeiChatPay from:"+from+"\tto:"+to+"\tvalue:"+value);
        return true;
    }
}
