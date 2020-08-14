package encapsulation.bankClientProfiles;

import encapsulation.designs.BankClient;

import java.util.Arrays;

public class AnamBankProfile {
    public static void main(String[] args) {
        BankClient anamBankProfile = new BankClient();
        anamBankProfile.setName("Anam");
        anamBankProfile.setDob("01-09-1988");
        anamBankProfile.setSsn("123456789");
        anamBankProfile.setRoutingNum(176345678l);
        anamBankProfile.setAccountNum(645789765l);
        anamBankProfile.setBalance(455_987);

        Object[][] transactions = new Object[3][3];
        transactions[0][0] = "01-01-2020";
        transactions[0][1] = "gas";
        transactions[0][2] = 15.35;
        transactions[1][0] = "01-02-2020";
        transactions[1][1] = "grocery";
        transactions[1][2] = 50.55;
        transactions[2][0] = "01-03-2020";
        transactions[2][1] = "walgreens";
        transactions[2][2] = 30.98;


        anamBankProfile.setTransactions(transactions);

        System.out.println(anamBankProfile.getName());
        System.out.println(anamBankProfile.getDob());
        System.out.println(anamBankProfile.getSsn());
        System.out.println(anamBankProfile.getRoutingNum());
        System.out.println(anamBankProfile.getAccountNum());
        System.out.println(anamBankProfile.getBalance());
        System.out.println(Arrays.deepToString(anamBankProfile.getTransactions()));
    }
}
