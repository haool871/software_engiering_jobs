//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package code;

public class XiaoPiao {
    protected double total;
    protected String shopName;
    protected com.skb.searchandorder.AbstractFood[] xiaopiao = new com.skb.searchandorder.AbstractFood[50];
    protected int x = 0;

    void add(com.skb.searchandorder.AbstractFood food) {
        this.xiaopiao[this.x++] = food;
    }

    public XiaoPiao(String name) {
        this.shopName = name;
    }

    public double getTotal() {
        double sum = 0.0;

        for(int i = 0; i < this.x; ++i) {
            sum += this.xiaopiao[i].getPrice();
        }

        return sum;
    }

    public void display() {
        System.out.println("店名：" + this.shopName);
        System.out.println("id\tname\tprice");

        for(int i = 0; i < this.x; ++i) {
            String name = this.xiaopiao[i].getName();
            double money = this.xiaopiao[i].getPrice();
            System.out.println(i + 1 + "\t" + name + "\t" + money);
        }

        this.total = this.getTotal();
        System.out.println("total:" + this.total);
    }
}
