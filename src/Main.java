public class Main {
    public static void main(String[] args) {

        Account[] accounts = new Account[]{
                new SavingsAccount(20000, "[cберегательный]"),
                new CheckingAccount(10000, "[расчетный]"),
                new CreditAccount("[кредитный]")
        };
        Account testAccount = new SavingsAccount(3000, "[cберегательный-тестовый]");
        Account testAccount2 = new CreditAccount( "[кредитный-тестовый]");

        for (Account account : accounts) {
            account.addMoney(4000);
            account.pay(6000);
            account.transfer(testAccount, 3000);
        }

        testAccount.transfer(testAccount2, 10000);
    }
}