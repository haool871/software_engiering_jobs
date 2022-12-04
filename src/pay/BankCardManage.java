package pay;

import java.util.Scanner;

public class BankCardManage implements WalletManage{
    @Override
    public void bankCardManage() {
        System.out.println("bank card manage");
        System.out.println("输入1添加银行卡;输入其他退出");
        Scanner in=new Scanner(System.in);
        String line = in.nextLine();
        if (line.equals("1")){
            System.out.println("输入1：ABC;输入2:ICBC;输入其他退出");
            String s = in.nextLine();
            BankCardFactory bankCardFactory=new BankCardFactory();
            if (s.equalsIgnoreCase("ABC")){
                bankCardFactory.getBankCard("ABC");
            }else if (s.equalsIgnoreCase("icbc")){
                bankCardFactory.getBankCard("ICBC");
            }
        }else {
            System.out.println("退出银行卡管理");
        }
    }

    @Override
    public void balanceManage() {

    }

    @Override
    public void billManage(Comsumption comsumption) {

    }

    @Override
    public void payByCard() {
        System.out.println("pay by card");
    }

    @Override
    public void payByBalance() {
    }
}
