package pay;

import java.util.LinkedList;
import java.util.List;

public class Billiml implements Bill{

    private List<BillData> billData=new LinkedList<>();
    @Override
    public List<BillData> getBill() {
        return billData;
    }

    @Override
    public void addData(BillData data) {
        billData.add(data);
    }
}
