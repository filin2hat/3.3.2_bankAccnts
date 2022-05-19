public abstract class Account {
    protected int amount;
    protected String typeAccount;

    public Account(int amount, String typeAccount) {
        this.amount = amount;
        this.typeAccount = typeAccount;
    }

    abstract void pay(int amount);

    abstract void transfer(Account account, int amount);

    abstract void addMoney(int amount);


    @Override
    public String toString() {
        return typeAccount;
    }
}