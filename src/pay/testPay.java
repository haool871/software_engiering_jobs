package pay;

import java.util.Scanner;

public class testPay {
    public static void main(String[] args) {
        User user1=new User();
        user1.setUserName("u1");
        user1.setPwd("u1pwd");

        User user2=new User();
        user2.setUserName("u2");
        user2.setPwd("u2pwd");

        Scanner in=new Scanner(System.in);
        while (true){
            System.out.println("输入选择:1第三方支付;2钱包支付;3钱包管理;-1退出");
            String choice = in.nextLine();
            if (choice.equalsIgnoreCase("1")){
                user1.toolPay();
            }else if (choice.equalsIgnoreCase("2")){
                user1.walletPay();
            }else if (choice.equalsIgnoreCase("3")){
                user1.walletManage();
            }else if (choice.equalsIgnoreCase("-1")){
                break;
            }else {
                System.out.println("命令错误");
            }
        }
    }
}
