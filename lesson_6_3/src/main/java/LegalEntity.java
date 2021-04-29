import java.util.Scanner;

public class LegalEntity extends Client {

    public static int balance = 178578;
    private static int commissionpercent;

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
        System.out.println("При снятии средств, с вас удержится комиссия в размере 1% от суммы снятия.");
        Scanner scanner = new Scanner(System.in);
        System.out.println(WITHDRAW);
        int withdrawsum = scanner.nextInt();
        System.out.println(WITHDRAWN_FROM_ACCOUNT + withdrawsum);
        commissionpercent = withdrawsum / 100;
        System.out.println("Комиссия: " + commissionpercent);
        balance = balance - withdrawsum - commissionpercent;
        System.out.println(ACCOUNT_BALANCE + balance + "\n");
    }
}
