//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package code;

import java.util.Scanner;

public class KFC extends com.skb.searchandorder.AbstractShop {
    Scanner in;

    public KFC() {
        this.in = new Scanner(System.in);
        this.visit();
    }

    public void visit() {
        System.out.println("/*---------------------------欢迎来到董哥KFC ------------------------------------------*/");
        Menu_KFC menu = new Menu_KFC();
        menu.display();
        System.out.print("是否需要点餐？（1:是 / 其它：否）:");
        int answer = this.in.nextInt();
        if (answer == 1) {
            this.order();
        }

        try {
            System.out.println("按任意键继续。。。");
            System.in.read();
        } catch (Exception var4) {
        }

    }

    public void order() {
        System.out.print("开始点餐,请输入需要菜品的id (结束：-1)：");
        XiaoPiao xiaopiao = new XiaoPiao("KFC");
        int i = 0;

        while(true) {
            if (i >= 50) {
                System.out.println("订单数额已满，不能继续点餐了，sorry");
                break;
            }

            int id = this.in.nextInt();
            if (id == -1) {
                System.out.println("结束点餐");
                break;
            }

            if (id == 1) {
                com.skb.searchandorder.Hamburger food = new com.skb.searchandorder.Hamburger();
                xiaopiao.add(food);
                ++i;
            } else if (id == 2) {
                com.skb.searchandorder.Coko food = new com.skb.searchandorder.Coko();
                xiaopiao.add(food);
                ++i;
            } else if (id == 3) {
                com.skb.searchandorder.Hoddog food = new com.skb.searchandorder.Hoddog();
                xiaopiao.add(food);
                ++i;
            } else {
                System.out.println("没有这个餐品id");
            }

            System.out.print("请继续点餐：");
        }

        Order.xiaoPiaos.add(xiaopiao);
        System.out.println("您的订单为:");
        xiaopiao.display();
        System.out.println("请支付");
        System.out.println("KFC浏览完毕\n");
    }
}
