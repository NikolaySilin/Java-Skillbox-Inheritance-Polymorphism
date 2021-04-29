import java.util.Scanner;

public class IndividualEntrepreneur extends Client {

    public static int balance = 427211;
    private static int commissionpercent;

    public static void viewBalance() {
        System.out.println(BALANCE + balance + "\n");
    }

    public static void deposit() {
        System.out.println("Комиссия на зачисление средств составит 1% если сумма меньше 1000, и 0.5% если сумма больше, либо равна 1000");
        Scanner scanner = new Scanner(System.in);
        System.out.println(DEPOSIT);
        int depositsum = scanner.nextInt();
        if (depositsum < 1000) {
            commissionpercent = depositsum / 100;
            System.out.println("Комиссия: " + commissionpercent);
            depositsum -= commissionpercent;
            balance += depositsum;
            System.out.println(DEPOSITED_INTO_ACCOUNT + depositsum);
            System.out.println(ACCOUNT_BALANCE + balance + "\n");
        } else if (depositsum >= 1000) {
            commissionpercent = depositsum / 200;
            System.out.println("Комиссия: " + commissionpercent);
            System.out.println(DEPOSITED_INTO_ACCOUNT + (depositsum - commissionpercent));
            balance += (depositsum - commissionpercent);
            System.out.println(ACCOUNT_BALANCE + balance + "\n");
        }
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
