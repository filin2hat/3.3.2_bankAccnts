public abstract class Account {
    protected int balance;
    protected String typeAccount;

    public Account(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Account(int balance, String typeAccount) {
        this.balance = balance;
        this.typeAccount = typeAccount;
    }

    abstract boolean pay(int amount);

    abstract boolean transfer(Account account, int amount);

    abstract boolean addMoney(int amount);

    public void getBalance() {
        System.out.println("БАЛАНС счета " + typeAccount + " :" + balance + ".\n");
    }
    public void noBalance() {
        System.out.println("Недостаточно средств для операции.");
    }


    @Override
    public String toString() {
        return typeAccount;
    }
}