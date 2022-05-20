public class CreditAccount extends Account {
    public CreditAccount(String typeAccount) {
        super(typeAccount);
    }

    @Override
    boolean pay(int amount) {
        balance -= amount;
        System.out.println("Оплата со счета " + typeAccount + " в размере " + amount + ".\n");
        getBalance();
        return true;
    }

    @Override
    boolean transfer(Account account, int amount) {
        if (account.addMoney(amount)) {
            balance -= amount;
            System.out.println("Перевод суммы в размере " + amount + " на счет " + account + ".\n");
            getBalance();
            return true;
        }
        return false;
    }

    @Override
    boolean addMoney(int amount) {
        if (balance + amount > 0) {
            System.out.println("Нельзя пополнить кредитный счет на сумму, превышающую сумму кредита!\n");
            return false;
        }
        balance += amount;
        System.out.println("Счет " + typeAccount + " пополнен на " + amount + ".\n");
        getBalance();
        return true;
    }
}

