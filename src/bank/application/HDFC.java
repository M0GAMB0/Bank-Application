package bank.application;

import java.util.UUID;

public class HDFC implements BankInterface{
    private int balance;
    private final String accountNo;
    private final String name;
    private String password;
    private static double rateOfInterest;
    public HDFC(int balance,String password, String name){
        this.balance=balance;
        this.password=password;
        this.name=name;
        accountNo= UUID.randomUUID().toString();
    }
    @Override
    public int checkBalance(String password) {
        if(password.equals(this.password)){
            return balance;
        }
        return -1;
    }

    @Override
    public String addMoney(int money) {
        balance+=money;
        return money+" has been added to "+accountNo+" successfully";
    }

    @Override
    public String withDraw(int money, String password) {
        if(password.equals(this.password)){
            if(money>balance){
                return "Insufficient Balance";
            }
            else{
                balance-=money;
                return money+" is debited from your account "+accountNo;
            }
        }
        else
            return "Incorrect Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(password.equals(oldPassword)){
            password=newPassword;
            return "Your has been changed succesfully";
        }
        else{
            return "Your oldPassword is incorrect";
        }
    }

    @Override
    public double calculateTotalInterest(int years, String password) {
        return balance*rateOfInterest*years/100;
    }
}
