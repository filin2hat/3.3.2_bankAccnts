public class Main {
    public static void main(String[] args) {
        Account savingAcc = new SavingsAccount(10000, "[cберегательный]");
        Account checkAcc = new CheckingAccount(10000, "[расчетный]");
        Account creditAcc = new CreditAccount(0, "[кредитный]");

        System.out.println(creditAcc.getAmount());
        System.out.println(savingAcc.getAmount());

        creditAcc.transfer(savingAcc, 52541);

        System.out.println(creditAcc.getAmount());
        System.out.println(savingAcc.getAmount());

    }
}