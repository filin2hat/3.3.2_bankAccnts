public class SavingsAccount extends Account {

    public SavingsAccount(int amount, String typeAccount) {

        super(amount, typeAccount);
    }

    @Override
    void pay(int amount) {
        System.out.println("С счета " + typeAccount + " операция оплаты невозможна!\nБАЛАНС: " +
                this.amount + "\n");
    }

    @Override
    void transfer(Account account, int amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
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
