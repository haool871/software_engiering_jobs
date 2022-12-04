package pay;

public class ABC implements BankCard{
    @Override
    public void addCard(String id) {
        System.out.println("add ABC card:"+id);
    }

    @Override
    public void pay() {

    }
}
