import java.util.Scanner;

public class Individual extends Client {

    public static int balance = 15242;

    public static void viewBalance() {
        System.out.println(BALANCE + balance + "\n");
    }

    public static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(DEPOSIT);
        int depositsum = scanner.nextInt();
        System.out.println(DEPOSITED_INTO_ACCOUNT + depositsum);
        balance += depositsum;
        System.out.println(ACCOUNT_BALANCE + balance + "\n");
    }

    public static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(WITHDRAW);
        int withdrawsum = scanner.nextInt();
        System.out.println(WITHDRAWN_FROM_ACCOUNT + withdrawsum);
        balance -= withdrawsum;
        System.out.println(ACCOUNT_BALANCE + balance + "\n");
    }
}
