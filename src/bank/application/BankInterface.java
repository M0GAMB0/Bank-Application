package bank.application;

public interface BankInterface {
    public int checkBalance(String password);
    public String addMoney(int money, String password);
    public String withDraw(int money, String password);
    public String changePassword(String oldPassword, String newPassword);
    public  int calculateTotalInterest(int years, String password);

}
