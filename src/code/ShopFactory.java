//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package code;

import java.util.Scanner;

public class ShopFactory extends com.skb.searchandorder.AbstractFactory {
    Scanner in;

    public ShopFactory() {
        this.in = new Scanner(System.in);
    }

    public com.skb.searchandorder.Order getOrder() {
        return null;
    }

    public com.skb.searchandorder.Notice getNotice() {
        return null;
    }

    public com.skb.searchandorder.Group getGroup() {
        return null;
    }

    public com.skb.searchandorder.AbstractShop getShop() {
        System.out.println("当前有的店家shop有：\n1:KFC\n2:垚哥烧烤店");
        System.out.print("请输入你想浏览的店家id(-1退出):");

        while(true) {
            int i = this.in.nextInt();
            if (i == -1) {
                return null;
            }

            if (i == 1) {
                return new com.skb.searchandorder.KFC();
            }

            if (i == 2) {
                return new com.skb.searchandorder.Barbecue();
            }

            System.out.print("请输入有效数字:");
        }
    }
}
