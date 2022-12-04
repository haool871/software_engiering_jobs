package pay;

public class WalletAdapter {
    private WalletManage walletManage;
    public void walletPay(String tool){
        if (tool.equalsIgnoreCase("bankCard")){
            walletManage=new BankCardManage();
            walletManage.payByCard();
        }else if (tool.equalsIgnoreCase("balance")){
            walletManage=new BalanceManage();
            walletManage.payByBalance();
        }else {
            System.out.println("输入错误");
        }
    }
    public void walletManage(String tool,Comsumption comsumption){
        if (tool.equalsIgnoreCase("bankCard")){
            walletManage=new BankCardManage();
            walletManage.bankCardManage();
        }else if (tool.equalsIgnoreCase("balance")){
            walletManage=new BalanceManage();
            walletManage.balanceManage();
        }else if (tool.equalsIgnoreCase("bill")){
            walletManage=new BillManage();
            walletManage.billManage(comsumption);
        }else {
            System.out.println("输入错误");
        }
    }
}
