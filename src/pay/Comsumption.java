package pay;

import java.util.List;

public class Comsumption extends BillDecorater{

    public Comsumption getComsumption(){
        return this;
    }
    public void income(){
        List<BillData> bill = super.getBill();
        double value= bill.stream().filter(billData -> billData.isIncome).mapToDouble(billData -> billData.value).sum();
        System.out.println("收入为:"+value);
    }
    public void outCome(){
        List<BillData> bill = super.getBill();
        double value= bill.stream().filter(billData -> !billData.isIncome).mapToDouble(billData -> billData.value).sum();
        System.out.println("支出为:"+value);
    }
    public void showAll(){
        List<BillData> bill = super.getBill();
        bill.forEach(billData -> {
            System.out.println(billData.toString());
        });
    }
}
