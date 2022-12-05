package com.skb.searchandorder;

import java.util.Scanner;

public class AfterSales extends AbstractAfterSales{
    Scanner in;
    AbstractFactory fac = new OrderFactory();
    Order order = fac.getOrder();
    public AfterSales(){
        this.in = new Scanner(System.in);
        this.show();
    }
    public void show(){
//        System.out.println("/*---------------------------历史页面列表------------------------------------------*/");
        int i=0;
        order.display();
            System.out.println("\n请选择您想要进行售后处理的订单（输入id数字即可）");
            i = in.nextInt();
            if (i == -1) {
                try {
                    System.out.println("按任意键退出。。。");
                    System.in.read();
                } catch (Exception var10) {
                }
//                break;
            }
            if(i>order.getXiaopiaoSize()||i<=0){
                System.out.println("请输入有效数字");
            }else {

                System.out.println("\n请选择您想要进行的操作（输入id数字即可）");
                System.out.print("1:退款refund\n2:投诉complaint\n请输入：");
                i = in.nextInt();
                if (i == -1) {
                    try {
                        System.out.println("按任意键退出。。。");
                        System.in.read();
                    } catch (Exception var10) {
                    }

//                    break;
                }

                if (i == 1) {
                    this.refund();

                } else if (i == 2) {
                    this.complaint();
                } else {
                    System.out.println("请输入有效数字");
                }

            }


    }

    public  void refund(){
        System.out.println("\n请输入退款理由: ");
        in.nextLine();
        in.nextLine();
        System.out.println("\n申请退款成功，请耐心等待审核结果~ \n");

    };
    public  void complaint(){
        System.out.println("\n请输入投诉理由: ");
        in.nextLine();
        in.nextLine();
        System.out.println("\n投诉申请成功，请耐心等待审核结果~ \n");
    };
}
