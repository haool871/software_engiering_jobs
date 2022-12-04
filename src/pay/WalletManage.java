package pay;

public interface WalletManage {
    void bankCardManage();
    void balanceManage();
    void billManage(Comsumption comsumption);
    void payByCard();
    void payByBalance();
}
