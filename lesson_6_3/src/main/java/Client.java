import java.util.Scanner;

public abstract class Client {

    private static final String SERVICE = "Выберете услугу и введите в консоль: " +
            "\n\tУслуги для физических лиц - 1" +
            "\n\tУслуги для юридических лиц - 2" +
            "\n\tУслуги для индивидуальных предпринимателей - 3";

    private static final String TURN = "Выберете действие которое хотите совершить: " +
            "\n\tПоказать баланс счета - 1" +
            "\n\tВнести средства - 2" +
            "\n\tВывести средства - 3";

    private static final String YES_NO_INDIVIDUAL = "Продолжить работу с услугами для физических лиц ?" +
            "\n\tДа - 1" +
            "\n\tНет - 2";

    private static final String YES_NO_ENTERPRENEUR = "Продолжить работу с услугами для физических лиц ?" +
            "\n\tДа - 1" +
            "\n\tНет - 2";

    private static final String YES_NO_LEGAL_ENTITY = "Продолжить работу с услугами для физических лиц ?" +
            "\n\tДа - 1" +
            "\n\tНет - 2";

    public static final String BALANCE = "Баланс счета: ";
    public static final String DEPOSIT = "Введите сумму, которую хотите внести: ";
    public static final String WITHDRAW = "Введите сумму, которую хотите снять: ";
    public static final String ACCOUNT_BALANCE = "Остаток средств на счете: ";
    public static final String DEPOSITED_INTO_ACCOUNT = "Вы внесли на счет: ";
    public static final String WITHDRAWN_FROM_ACCOUNT = "Вы сняли со счета: ";

    public static void main(String[] args) {

        start();

    }

    static Scanner scanner1 = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
    static Scanner scanner3 = new Scanner(System.in);

    private static int choose;
    private static int pick;
    private static int adoption;

    public static void start() {
        System.out.println("Здравствуйте, вас приветствует банковская система !");
        for (; ; ) {
            System.out.println(SERVICE);
            choose = scanner1.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Вы выбрали услуги для физических лиц." + "\n");
                    for (;;) {
                        System.out.println(TURN);
                        pick = scanner2.nextInt();
                        switch (pick) {
                            case 1:
                                Individual.viewBalance();
                                System.out.println(YES_NO_INDIVIDUAL);
                                adoption = scanner3.nextInt();
                                switch (adoption) {
                                    case 1:
                                        continue;
                                    case 2:
                                        break;
                                }
                                break;

                            case 2:
                                Individual.deposit();
                                System.out.println(YES_NO_INDIVIDUAL);
                                adoption = scanner3.nextInt();
                                switch (adoption) {
                                    case 1:
                                        continue;
                                    case 2:
                                        break;
                                }
                                break;

                            case 3:
                                Individual.withdraw();
                                System.out.println(YES_NO_INDIVIDUAL);
                                adoption = scanner3.nextInt();
                                switch (adoption) {
                                    case 1:
                                        continue;
                                    case 2:
                                        break;
                                }
                                break;
                        }
                        break;
                    }

                case 2:
                    System.out.println("Вы выбрали услуги для юридических лиц." + "\n");
                    for (;;) {
                        System.out.println(TURN);
                        pick = scanner2.nextInt();
                        switch (pick) {
                            case 1:
                                LegalEntity.viewBalance();
                                System.out.println(YES_NO_LEGAL_ENTITY);
                                adoption = scanner3.nextInt();
                                switch (adoption) {
                                    case 1:
                                        continue;
                                    case 2:
                                        break;
                                }
                                break;

                            case 2:
                                LegalEntity.deposit();
                                System.out.println(YES_NO_LEGAL_ENTITY);
                                adoption = scanner3.nextInt();
                                switch (adoption) {
                                    case 1:
                                        continue;
                                    case 2:
                                        break;
                                }
                                break;

                            case 3:
                                LegalEntity.withdraw();
                                System.out.println(YES_NO_LEGAL_ENTITY);
                                adoption = scanner3.nextInt();
                                switch (adoption) {
                                    case 1:
                                        continue;
                                    case 2:
                                        break;
                                }
                                break;
                        }
                        break;
                    }

                case 3:
                    System.out.println("Вы выбрали услуги для индивидуальных предпринимателей." + "\n");
                    for (;;) {
                        System.out.println(TURN);
                        pick = scanner2.nextInt();
                        switch (pick) {
                            case 1:
                                IndividualEntrepreneur.viewBalance();
                                System.out.println(YES_NO_ENTERPRENEUR);
                                adoption = scanner3.nextInt();
                                switch (adoption) {
                                    case 1:
                                        continue;
                                    case 2:
                                        break;
                                }
                                break;

                            case 2:
                                IndividualEntrepreneur.deposit();
                                System.out.println(YES_NO_ENTERPRENEUR);
                                adoption = scanner3.nextInt();
                                switch (adoption) {
                                    case 1:
                                        continue;
                                    case 2:
                                        break;
                                }
                                break;

                            case 3:
                                IndividualEntrepreneur.withdraw();
                                System.out.println(YES_NO_ENTERPRENEUR);
                                adoption = scanner3.nextInt();
                                switch (adoption) {
                                    case 1:
                                        continue;
                                    case 2:
                                        break;
                                }
                                break;
                        }
                        break;
                    }
            }
        }
    }

}