public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructor without initial balance
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0; // Default balance set to 0
    }

    // Constructor with initial balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Adds amount to balance
    public void credit(int amount) {
        this.balance += amount;
    }

    // Subtracts amount from balance if enough balance is available
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Transfers amount to another Account, if sufficient funds are available
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Transfer amount exceeded balance");
        }
        return balance;
    }

    
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
