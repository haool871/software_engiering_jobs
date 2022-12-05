//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.skb.searchandorder;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        AbstractFactory fac = new OrderFactory();
        Order order = fac.getOrder();
        new GroupSession();
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("/*---------------------------欢迎来到美团 ------------------------------------------*");
            System.out.println("请输入您想浏览的界面（输入id数字即可）");
            System.out.print("1:店家shop\n2:订单order\n3:公告notice\n4:群聊group\n5:退款售后\n-1:退出美团\n请输入：");
            int i = in.nextInt();
            if (i == -1) {
                try {
                    System.out.println("按任意键退出。。。");
                    System.in.read();
                } catch (Exception var10) {
                }

                return;
            }

            if (i == 1) {
                System.out.println("/*---------------------------进入店家页面 ------------------------------------------*");
                fac = new ShopFactory();
                AbstractShop var6 = fac.getShop();
            } else if (i == 2) {
                System.out.println("/*---------------------------进入订单页面 ------------------------------------------*/");
                order.display();
            } else if (i == 3) {
                System.out.println("/*---------------------------进入公告页面 ------------------------------------------*/");
                 fac = new NoticeFactory();
                Notice var4 = fac.getNotice();
            } else if (i == 4) {
                System.out.println("/*---------------------------进入群聊页面 ------------------------------------------*/");
                fac = new GroupFactory();
                Group var5 = fac.getGroup();
            } else if (i == 5) {
                System.out.println("/*---------------------------进入售后页面 ------------------------------------------*/");
                AfterSales afterS = new AfterSales();
//                fac = new GroupFactory();
//                Group var5 = fac.getGroup();
            }
            else {
                System.out.println("请输入有效数字");
            }
        }
    }
}
