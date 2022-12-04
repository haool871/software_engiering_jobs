package pay;

public class ProxyPay implements PayTool{
    private PayTool real;

    @Override
    public boolean pay(String tool, double value, String to, String from) {
        if (tool.isBlank()||value<0||to.isBlank()||from.isBlank()){
            System.out.println("支付输入有误");
        }else if (tool.equalsIgnoreCase("AliPay")){
            real=new AliPay();
        }else if (tool.equalsIgnoreCase("WeiChatPay")){
            real=new WeiChatPay();
        }else {
            System.out.println("支付工具输入错误");
            return false;
        }
        real.pay(tool,value,to,from);
        return true;
    }
}
