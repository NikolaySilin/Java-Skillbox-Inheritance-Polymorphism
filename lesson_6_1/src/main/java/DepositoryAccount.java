import java.util.Scanner;

public class DepositoryAccount extends BankAccount {

    public static final long month = 2678400000L;
    public static int depositorybalance = 150000;

    private static long checktime1;
    private static long checktime2;


    public static void printBalanceDepository() {
        System.out.println("Баланс депозитарного счета: " + depositorybalance + "\n");
    }

    public static void depositFoundsDepository() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если вы внесете средства на депозитарный счет, то снять средства вы сможете только по истечению срока в 1 месяц.");
        System.out.println("Введите сумму, которую хотите внести: ");
        int depositsumdepo = scanner.nextInt();
        if (depositsumdepo > 0) {
            checktime1 = System.currentTimeMillis();
            System.out.println("Вы внесли на счет: " + depositsumdepo);
            int deposit = depositorybalance + depositsumdepo;
            System.out.println("Остаток средств на счете: " + deposit + "\n");
            depositorybalance = deposit;
        } else {
            System.out.println("Вы указали неверную сумму!");
        }
    }

    public static void withdrawFoundsDepository() {
        checktime2 = System.currentTimeMillis();
        if (checktime() == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите сумму, которую хотите снять: ");
            int withdrawsumdepo = scanner.nextInt();
            System.out.println("Вы сняли со счета: " + withdrawsumdepo);
            int withdraw = depositorybalance - withdrawsumdepo;
            System.out.println("Остаток средств на счете: " + withdraw + "\n");
            depositorybalance = withdraw;
        } else {
            System.out.println("Уважаемый клиент, еще не истек срок в 1 месяц после внесения средств.");
        }
    }

    public static void sendDepoToBank() {
        depositorybalance = depositorybalance - sum;
        BankAccount.balance = BankAccount.balance + sum;
        printBalanceDepository();
        BankAccount.printBalance();
    }

    public static void sendDepoToCard() {
        depositorybalance = depositorybalance - sum;
        CardAccount.balancecard = CardAccount.balancecard + sum;
        printBalanceDepository();
        CardAccount.printBalanceCard();
    }

    public static boolean checktime() {
        if ((checktime2 - checktime1) >= month) {
            return true;
        } else {
            return false;
        }
    }
}
