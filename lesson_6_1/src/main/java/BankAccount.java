import java.util.Scanner;

public class BankAccount {

    private static final String HELLO = "Вас приветствует банковская система!";
    private static final String CHOOSE_ACCOUNT = "Выберете пожалуйста счет, с которым хотите взаимодействовать, и введите в консоль команду: " +
            "\nБанковский счет - bank" +
            "\nКарточный счет - card" +
            "\nДепозитарный счет - depo" +
            "\nПеревести с счета на счет - send";

    private static final String CHOOSE_OPERATION = "Выберете и введите операцию в консоль: " +
            "\nУзнать баланс - balance" +
            "\nСнять средства - withdraw" +
            "\nВнести средства - deposit" +
            "\nВаша команда: ";

    private static final String CHOOSE_BILL = "Выберете счет на который хотите перевести средства: ";

    private static final String ENTER_SUM = "Введите сумму которую хотите перевести: ";

    private static final String BANK = "Вы выбрали банковский счет.";
    private static final String CARD = "Вы выбрали карточный счет.";
    private static final String DEPO = "Вы выбрали депозитарный счет.";

    private static final String SEND_BANK = "Вы выбрали перевод на банковский счет.";
    private static final String SEND_CARD = "Вы выбрали перевод на карточный счет.";
    private static final String SEND_DEPO = "Вы выбрали перевод на депозитарный счет.";

    private static final String CHOOSE_SEND = "Выберете пожалуйста счет с которого хотите перевести средства: " +
            "\nБанковский счет - bank" +
            "\nКарточный счет - card" +
            "\nДепозитарный счет - depo";

    private static final String CHOOSE_SEND_BANK = "Карточный счет - card" +
            "\nДепозитарный счет - depo";

    private static final String CHOOSE_SEND_CARD = "Банковский счет - bank" +
            "\nДепозитарный счет - depo";

    private static final String CHOOSE_SEND_DEPO = "Банковский счет - bank" +
            "\nКарточный счет - card";

    private static final String WRONG_SUM = "Неверная сумма !";




    public static void main(String[] args) {

        start();

    }

    public static int balance = 70000;
    public static int sum;

    private static long checktime1;
    private static long checktime2;

    public static void start() {

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);

        String choose1;
        String choose2;
        String choose3;

        for (;;) {
            System.out.println(HELLO);
            System.out.println(CHOOSE_ACCOUNT);
            choose1 = scanner1.nextLine();
            if (choose1.equalsIgnoreCase("bank")) {
                System.out.println(BANK);
                System.out.println(CHOOSE_OPERATION);
                choose2 = scanner2.nextLine();
                if (choose2.equalsIgnoreCase("balance")) {
                    printBalance();
                } else if (choose2.equalsIgnoreCase("withdraw")) {
                    withdrawFounds();
                } else if (choose2.equalsIgnoreCase("deposit")) {
                    depositFounds();
                }
            } else if (choose1.equalsIgnoreCase("card")) {
                System.out.println(CARD);
                System.out.println(CHOOSE_OPERATION);
                choose2 = scanner2.nextLine();
                if (choose2.equalsIgnoreCase("balance")) {
                    CardAccount.printBalanceCard();
                } else if (choose2.equalsIgnoreCase("withdraw")) {
                    CardAccount.withdrawFoundsCard();
                } else if (choose2.equalsIgnoreCase("deposit")) {
                    CardAccount.depositFoundsCard();
                }
            } else if (choose1.equalsIgnoreCase("depo")) {
                System.out.println(DEPO);
                System.out.println(CHOOSE_OPERATION);
                choose2 = scanner2.nextLine();
                if (choose2.equalsIgnoreCase("balance")) {
                    DepositoryAccount.printBalanceDepository();
                } else if (choose2.equalsIgnoreCase("withdraw")) {
                    DepositoryAccount.withdrawFoundsDepository();
                } else if (choose2.equalsIgnoreCase("deposit")) {
                    DepositoryAccount.depositFoundsDepository();
                }
            } else if (choose1.equalsIgnoreCase("send")) {
                System.out.println(CHOOSE_SEND);
                choose2 = scanner2.nextLine();
                if (choose2.equalsIgnoreCase("bank")) {
                    System.out.println(BANK);
                    System.out.println(CHOOSE_BILL);
                    System.out.println(CHOOSE_SEND_BANK);
                    choose3 = scanner3.nextLine();
                    if (choose3.equalsIgnoreCase("card")) {
                        System.out.println(SEND_CARD);
                        System.out.println(ENTER_SUM);
                        sum = scanner4.nextInt();
                        if (sum <= balance) {
                            sendBankToCard();
                        } else {
                            System.out.println(WRONG_SUM);
                        }
                    } if (choose3.equalsIgnoreCase("depo")) {
                        System.out.println(SEND_DEPO);
                        System.out.println(ENTER_SUM);
                        sum = scanner4.nextInt();
                        if (sum <= DepositoryAccount.depositorybalance) {
                            sendBankToDepo();
                        } else {
                            System.out.println(WRONG_SUM);
                        }
                    }
                } else if (choose2.equalsIgnoreCase("card")) {
                    System.out.println(CARD);
                    System.out.println(CHOOSE_BILL);
                    System.out.println(CHOOSE_SEND_CARD);
                    choose3 = scanner3.nextLine();
                    if (choose3.equalsIgnoreCase("bank")) {
                        System.out.println(SEND_BANK);
                        System.out.println(ENTER_SUM);
                        sum = scanner4.nextInt();
                        if (sum <= CardAccount.balancecard) {
                            CardAccount.sendCardToBank();
                        } else {
                            System.out.println(WRONG_SUM);
                        }
                    } else if (choose3.equalsIgnoreCase("depo")) {
                        System.out.println(SEND_DEPO);
                        System.out.println(ENTER_SUM);
                        sum = scanner4.nextInt();
                        if (sum <= CardAccount.balancecard) {
                            CardAccount.sendCardToDepo();
                        } else {
                            System.out.println(WRONG_SUM);
                        }
                    }
                } else if (choose2.equalsIgnoreCase("depo")) {
                    System.out.println(DEPO);
                    System.out.println(CHOOSE_BILL);
                    System.out.println(CHOOSE_SEND_DEPO);
                    choose3 = scanner3.nextLine();
                    if (choose3.equalsIgnoreCase("bank")) {
                        System.out.println(SEND_BANK);
                        System.out.println(ENTER_SUM);
                        sum = scanner4.nextInt();
                        if (sum <= DepositoryAccount.depositorybalance) {
                            DepositoryAccount.sendDepoToBank();
                        } else {
                            System.out.println(WRONG_SUM);
                        }
                    } else if (choose3.equalsIgnoreCase("card")) {
                        System.out.println(SEND_CARD);
                        System.out.println(ENTER_SUM);
                        sum = scanner4.nextInt();
                        if (sum <= DepositoryAccount.depositorybalance) {
                            DepositoryAccount.sendDepoToCard();
                        } else {
                            System.out.println(WRONG_SUM);
                        }
                    }
                }
            }
        }
    }

    public static void printBalance() {
        System.out.println("Баланс банковского счета: " + balance + "\n");
    }

    public static void depositFounds() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму, которую хотите внести: ");
        int depositsum = scanner.nextInt();
        System.out.println("Вы внесли на счет: " + depositsum);
        int deposit = balance + depositsum;
        System.out.println("Остаток средств на счете: " + deposit + "\n");
        balance = deposit;
    }

    public static void withdrawFounds() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму, которую хотите снять: ");
        int withdrawsum = scanner.nextInt();
        System.out.println("Вы сняли со счета: " + withdrawsum);
        int withdraw = balance - withdrawsum;
        System.out.println("Остаток средств на счете: " + withdraw + "\n");
        balance = withdraw;
    }

    public static void sendBankToCard() {
        balance = balance - sum;
        CardAccount.balancecard = CardAccount.balancecard + sum;
        printBalance();
        CardAccount.printBalanceCard();
    }

    public static void sendBankToDepo() {
        balance = balance - sum;
        DepositoryAccount.depositorybalance = DepositoryAccount.depositorybalance + sum;
        printBalance();
        DepositoryAccount.printBalanceDepository();
    }
}
