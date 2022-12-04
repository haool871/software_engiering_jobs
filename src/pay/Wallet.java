package pay;

import java.util.Scanner;

public class Wallet {

    private Scanner in=new Scanner(System.in);
    WalletAdapter walletAdapter=new WalletAdapter();
    public void walletPay(){
        System.out.println("输入选择:bankCard/balance:");
        String tool=in.nextLine();
        walletAdapter.walletPay(tool);
    }
    public void walletManage(Comsumption comsumption){
        System.out.println("输入选择:bankCard/balance/bill:");
        String tool=in.nextLine();
        walletAdapter.walletManage(tool,comsumption);
    }
}
