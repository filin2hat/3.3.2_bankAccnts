public class Main {
    public static void main(String[] args) {

        Account[] accounts = new Account[]{
                new SavingsAccount(20000, "[cберегательный]"),
                new CheckingAccount(10000, "[расчетный]"),
                new CreditAccount("[кредитный]")
        };

        for (Account account : accounts) {
            account.addMoney(4000);
            account.pay(6000);
            account.transfer(accounts[0], 3000);
        }

        accounts[0].transfer(accounts[2], 10000);
    }
}