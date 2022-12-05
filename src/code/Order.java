//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order {
    public static List<XiaoPiao> xiaoPiaos = new ArrayList();

    public Order() {
    }
    public int getXiaopiaoSize(){
        return xiaoPiaos.size();
    }

    void add(XiaoPiao xiaopiao) {
        xiaoPiaos.add(xiaopiao);
    }

    void display() {
        if (xiaoPiaos.size() == 0) {
            System.out.println("您还没有订单，快去下单吧\n");
        } else {
            System.out.println("您的订单如下：\n");
            Iterator var1 = xiaoPiaos.iterator();

            while(var1.hasNext()) {
                XiaoPiao xiaoPiao = (XiaoPiao)var1.next();
                xiaoPiao.display();
            }
        }

        try {
            System.out.println("按任意键继续。。。");
            System.in.read();
        } catch (Exception var3) {
        }

    }
}
