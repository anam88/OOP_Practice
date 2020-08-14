package encapsulation.designs;

import java.util.Objects;

public class BankClient {
    private String name;
    private String dob;
    private String ssn;
    private long routingNum;
    private long accountNum;
    private double balance;
    private Object[][] transactions;

    public void setName(String name){
        this.name = name;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public void setSsn(String ssn){
        this.ssn = ssn;
    }
    public void setRoutingNum(long routingNum){
        this.routingNum = routingNum;
    }
    public void setAccountNum(long accountNum){
        this.accountNum = accountNum;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setTransactions(Object[][] transactions){
        this.transactions = transactions;
    }
    public String getName(){
        return name;
    }
    public String getDob(){
        return dob;
    }
    public String getSsn(){
        return ssn;
    }
    public long getRoutingNum(){
        return routingNum;
    }
    public long getAccountNum(){
        return accountNum;
    }
    public double getBalance(){
        return balance;
    }
    public Object[][] getTransactions(){
        return transactions;
    }





}
