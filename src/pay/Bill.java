package pay;

import java.util.List;

public interface Bill {
    List<BillData> getBill();
    void addData(BillData data);
}
