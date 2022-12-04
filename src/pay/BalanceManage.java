package pay;

public class BalanceManage implements WalletManage{
    @Override
    public void bankCardManage() {

    }

    @Override
    public void balanceManage() {
        System.out.println("balance Manage");
    }

    @Override
    public void billManage(Comsumption comsumption) {

    }

    @Override
    public void payByCard() {

    }

    @Override
    public void payByBalance() {
        System.out.println("pay by balance");
    }
}
