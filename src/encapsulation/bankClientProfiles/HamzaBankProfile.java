package encapsulation.bankClientProfiles;

import encapsulation.designs.BankClient;

import java.util.Arrays;

public class HamzaBankProfile {
    public static void main(String[] args) {
        BankClient hamzaBankProfile = new BankClient();
        hamzaBankProfile.setName("Hamza");
        hamzaBankProfile.setDob("06-07-1995");
        hamzaBankProfile.setSsn("27362763");
        hamzaBankProfile.setRoutingNum(176356712l);
        hamzaBankProfile.setAccountNum(6454589065l);
        hamzaBankProfile.setBalance(90_987);
        Object[][] transactions = new Object[5][3];
        transactions[0][0] = "04-01-2020";
        transactions[0][1] = "Restaurant";
        transactions[0][2] = 80.45;
        transactions[1][0] = "04-02-2020";
        transactions[1][1] = "Starbucks";
        transactions[1][2] = 3.45;
        transactions[2][0] = "04-03-2020";
        transactions[2][1] = "Target";
        transactions[2][2] = 30.98;
        transactions[3][0] = "04-04-2020";
        transactions[3][1] = "Walmart";
        transactions[3][2] = 105.20;
        transactions[4][0] = "04-05-2020" ;
        transactions[4][1] = "Football Game Ticket";
        transactions[4][2] = 200.65;

        hamzaBankProfile.setTransactions(transactions);

        System.out.println(hamzaBankProfile.getName());
        System.out.println(hamzaBankProfile.getDob());
        System.out.println(hamzaBankProfile.getSsn());
        System.out.println(hamzaBankProfile.getRoutingNum());
        System.out.println(hamzaBankProfile.getAccountNum());

        System.out.println("$"+hamzaBankProfile.getBalance());
        System.out.print(Arrays.deepToString(hamzaBankProfile.getTransactions()));


    }
}
