package pay;

public class ICBC implements BankCard{
    @Override
    public void addCard(String id) {
        System.out.println("add ICBC card:"+id);
    }

    @Override
    public void pay() {

    }
}
