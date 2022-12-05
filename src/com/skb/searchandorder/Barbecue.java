//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.skb.searchandorder;

import java.util.Scanner;

public class Barbecue extends com.skb.searchandorder.AbstractShop {
    Scanner in;

    public Barbecue() {
        this.in = new Scanner(System.in);
        this.visit();
    }

    public void visit() {
        System.out.println("/*---------------------------欢迎来到垚哥烧烤店 ------------------------------------------*/");
        Menu_Barbecue menu = new Menu_Barbecue();
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
        XiaoPiao xiaopiao = new XiaoPiao("Barbecue");
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
                Mutton food = new Mutton();
                xiaopiao.add(food);
                ++i;
            } else if (id == 2) {
                Beef food = new Beef();
                xiaopiao.add(food);
                ++i;
            } else if (id == 3) {
                Drumsticks food = new Drumsticks();
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
        System.out.println("Barbecue浏览完毕\n");
    }
}
