public class CreditAccount extends Account {

    public CreditAccount(int amount, String typeAccount) {
        super(amount, typeAccount);
    }

    @Override
    void pay(int amount) {
        this.amount -= amount;
        System.out.println("Оплата со счета " + typeAccount + " в размере " + amount + ". \nБАЛАНС: " + this.amount + "\n");
    }

    @Override
    void transfer(Account account, int amount) {
        this.amount -= amount;
        account.amount+=amount;
        System.out.println("Перевод суммы в размере " + amount + " на счет " + account +
                ". БАЛАНС: " + this.amount + "\n");
    }

    @Override
    void addMoney(int amount) {
        if (this.amount < 0) {
            this.amount += amount;
            System.out.println("Счет " + typeAccount + " пополнен на " + amount + " рублей. \nБАЛАНС: " + this.amount + "\n");
        } else {
            System.out.println("Кредитная линия закрыта полностью. Пополнение счета " + typeAccount + " не возможно!\nБАЛАНС: " + this.amount + "\n");
        }
    }
}

