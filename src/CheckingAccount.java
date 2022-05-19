public class CheckingAccount extends Account {

    public CheckingAccount(int amount, String typeAccount) {

        super(amount, typeAccount);
    }

    @Override
    void pay(int amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            System.out.println("Оплата со счета " + typeAccount + " в размере " + amount + ". \nБАЛАНС: " + this.amount + "\n");
        } else {
            System.out.println("Не достаточно средств на счете " + typeAccount + " для оплаты. \nБАЛАНС: " + this.amount + "\n");
        }
    }

    @Override
    void transfer(Account account, int amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            account.amount+=amount;
            System.out.println("Перевод суммы в размере " + amount + " на счет " + account +
                    ". БАЛАНС: " + this.amount + "\n");
        } else {
            System.out.println("Не корректная сумма, либо недостаточно средств на счете " + typeAccount + ".\nБАЛАНС: " +
                    this.amount + "\n");
        }
    }

    @Override
    void addMoney(int amount) {
        this.amount += amount;
        System.out.println("Счет " + typeAccount + " пополнен на " + amount + " рублей. \nБАЛАНС: " + this.amount + "\n");
    }
}