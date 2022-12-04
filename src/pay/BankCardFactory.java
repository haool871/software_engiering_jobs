package pay;

import java.util.Date;

public class BankCardFactory {
    public BankCard getBankCard(String card){
        if (card.equalsIgnoreCase("ICBC")){
            ICBC bankCard=new ICBC();
            bankCard.addCard(String.valueOf(new Date()));
            return bankCard;
        }else if (card.equalsIgnoreCase("ABC")){
            ABC bankCard=new ABC();
            bankCard.addCard(String.valueOf(new Date()));
            return bankCard;
        }
        return null;
    }
}
