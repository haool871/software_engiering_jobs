package pay;

import java.util.List;

public class BillDecorater implements Bill{

    private Bill bill=new Billiml();
    @Override
    public List<BillData> getBill() {
        return bill.getBill();
    }

    @Override
    public void addData(BillData data) {
        bill.addData(data);
    }
}
