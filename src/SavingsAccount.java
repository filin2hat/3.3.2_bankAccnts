public class SavingsAccount extends Account {

    public SavingsAccount(int balance, String typeAccount) {

        super(balance, typeAccount);
    }

    @Override
    boolean pay(int amount) {
        System.out.println("С счета " + typeAccount + " операция оплаты невозможна!\n");
        getBalance();
        return false;
    }

    @Override
    boolean transfer(Account account, int amount) {
        if (balance < amount) {
            noBalance();
            getBalance();
            return false;
        } else if (account.addMoney(amount)) {
            balance -= amount;
            System.out.println("Перевод суммы в размере " + amount + " на счет " + account + ".\n");
            getBalance();
            return true;
        }
        return false;
    }

    @Override
    boolean addMoney(int amount) {
        balance += amount;
        System.out.println("Счет " + typeAccount + " пополнен на " + amount + ".\n");
        getBalance();
        return true;
    }
}
