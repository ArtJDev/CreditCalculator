import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CreditCalculator calculator = new CreditCalculator();
        try{
            System.out.println("Введите сумму кредита:");
            int amount = scan.nextInt();
            System.out.println("Введите срок кредита в годах:");
            int period = scan.nextInt();
            System.out.println("Введите процентную ставку:");
            double percent = scan.nextDouble();
            System.out.println("Ежемесячный платеж: " + calculator.payment(amount, period, percent));
            System.out.println("Начисленные проценты: " + calculator.percentAmount(amount, period, percent));
            System.out.println("Долг + проценты: " + calculator.fullPay(amount, period, percent));
        } catch (RuntimeException ex){
            ex.printStackTrace();
        }
    }
}