public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("1", "Noah Smith", 5000);
        Account acc2 = new Account("2", "Sarah Oates", 4000);

        System.out.println("Initial Accounts:");
        System.out.println(acc1);
        System.out.println(acc2);

        acc1.transferTo(acc2, 1000);

        System.out.println("After Transfer:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
