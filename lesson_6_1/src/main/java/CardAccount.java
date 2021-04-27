import java.util.Scanner;

public class CardAccount extends BankAccount {

    public static int balancecard = 40000;

    public static void printBalanceCard() {
        System.out.println("Баланс карточного счета: " + balancecard + "\n");
    }

    public static void depositFoundsCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму, которую хотите внести: ");
        int depositsumcard = scanner.nextInt();
        System.out.println("Вы внесли на счет: " + depositsumcard);
        int depositcard = balancecard + depositsumcard;
        System.out.println("Остаток средств на счете: " + depositcard + "\n");
        balancecard = depositcard;
    }

    public static void withdrawFoundsCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внимание! при снятии с средств с карты, удерживается комиссия 1%.");
        System.out.println("Введите сумму, которую хотите снять: ");
        int withdrawsumcard = scanner.nextInt();
        System.out.println("Вы сняли со счета: " + withdrawsumcard);
        int percent = withdrawsumcard/100;
        System.out.println("Комиссия составляет: " + percent);
        int withdrawcard = balancecard - (withdrawsumcard + percent);
        System.out.println("Остаток средств на счете: " + withdrawcard + "\n");
        balancecard = withdrawcard;
    }

    public static void sendCardToBank() {
        balancecard = balancecard - sum;
        balance = balance + sum;
        CardAccount.printBalanceCard();
        printBalance();
    }

    public static void sendCardToDepo() {
        balancecard = balancecard - sum;
        DepositoryAccount.depositorybalance = DepositoryAccount.depositorybalance + sum;
        CardAccount.printBalanceCard();
        DepositoryAccount.printBalanceDepository();
    }
}
