package pay;

public class BillData {
    String id;
    Boolean isIncome;
    Double value;

    public BillData(String id, Boolean isIncome, Double value) {
        this.id = id;
        this.isIncome = isIncome;
        this.value = value;
    }

    @Override
    public String toString() {
        return "BillData{" +
                "id='" + id + '\'' +
                ", isIncome=" + isIncome +
                ", value=" + value +
                '}';
    }
}
