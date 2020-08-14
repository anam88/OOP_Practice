package encapsulation.bankClientProfiles;

import encapsulation.designs.BankClient;

import java.util.Arrays;

public class MohammadBankProfile {
    public static void main(String[] args) {
        BankClient mohammadBankProfile = new BankClient();
        mohammadBankProfile.setName("Mohamamd");
        mohammadBankProfile.setDob("05-16-1988");
        mohammadBankProfile.setSsn("789678923");
        mohammadBankProfile.setRoutingNum(123456789l);
        mohammadBankProfile.setAccountNum(987654321l);
        mohammadBankProfile.setBalance(105_987);
        Object[][] transactions = new Object[4][3];
        transactions[0][0] = "03-01-2020";
        transactions[0][1] = "gas";
        transactions[0][2] = 20.35;
        transactions[1][0] = "03-02-2020";
        transactions[1][1] = "grocery";
        transactions[1][2] = 70.55;
        transactions[2][0] = "03-03-2020";
        transactions[2][1] = "CVS";
        transactions[2][2] = 30.98;
        transactions[3][0] = "03-04-2020";
        transactions[3][1] = "Sams Club";
        transactions[3][2] = 105.20;


        mohammadBankProfile.setTransactions(transactions);

        System.out.println(mohammadBankProfile.getName());
        System.out.println(mohammadBankProfile.getDob());
        System.out.println(mohammadBankProfile.getSsn());
        System.out.println(mohammadBankProfile.getRoutingNum());
        System.out.println(mohammadBankProfile.getAccountNum());
        System.out.println("$"+mohammadBankProfile.getBalance());
        System.out.print(Arrays.deepToString(mohammadBankProfile.getTransactions()));



    }
}
