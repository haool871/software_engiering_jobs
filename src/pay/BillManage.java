package pay;

import java.util.Scanner;

public class BillManage implements WalletManage{
    @Override
    public void bankCardManage() {

    }

    @Override
    public void balanceManage() {

    }

    @Override
    public void billManage(Comsumption comsumption) {
        System.out.println("bill manage");
        System.out.println("输入1查看收入;2查看支出;3查看所有记录;其他退出");
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();
        if (s.equalsIgnoreCase("1")){
            comsumption.income();
        }else if (s.equalsIgnoreCase("2")){
            comsumption.outCome();
        }else if (s.equalsIgnoreCase("3")){
            comsumption.showAll();
        }
    }

    @Override
    public void payByCard() {

    }

    @Override
    public void payByBalance() {

    }
}
