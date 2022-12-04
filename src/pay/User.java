package pay;

import java.util.Scanner;

public class User {
    private String userName;
    private String pwd;
    private final Wallet wallet=new Wallet();
    private final Comsumption comsumption=new Comsumption();

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public void toolPay(){
        Scanner scanner=new Scanner(System.in);
        ProxyPay proxyPay=new ProxyPay();

        String from=this.userName;
        System.out.println("输入目标用户");
        String to=scanner.nextLine();
        System.out.println("输入支付工具");
        String tool=scanner.nextLine();
        System.out.println("输入金额");
        double value=scanner.nextDouble();
        if (proxyPay.pay(tool,value,to,from)){
            comsumption.addData(new BillData("0",false,value));
        }
    }

    public void walletPay(){
        wallet.walletPay();
    }
    public void walletManage(){
        wallet.walletManage(comsumption);
    }
}
