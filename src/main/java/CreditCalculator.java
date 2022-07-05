public class CreditCalculator {
    public double payment(int amount, int period, double percent) {
        return (amount * (percent/100) * period + amount) / (period * 12);
    }

    public double percentAmount(int amount, int period, double percent) {
        return (amount * ((100 + percent)/100) * period) - (amount * period);
    }

    public double fullPay(int amount, int period, double percent) {
        return amount * ((percent)/100) * period + amount;
    }
}