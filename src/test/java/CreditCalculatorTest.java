import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreditCalculatorTest {
    private static String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss"));
    private int amount = 1000;
    private int period = 1;
    private double percent = 5.0;
    CreditCalculator sut = new CreditCalculator();

    @BeforeAll
    public static void started() {
        System.out.println("Tests started: " + time);
    }

    @AfterAll
    public static void finished() {
        System.out.println("Tests finished: " + time);
    }

    @Test
    public void testPayment() {
        double expected = 87.5;
        double result = sut.payment(amount, period, percent);
        assertEquals(expected, result);
    }

    @Test
    public void testPercentAmount() {
        double expected = 50.0;
        double result = sut.percentAmount(amount, period, percent);
        assertEquals(expected, result);
    }

    @Test
    public void testFullPay() {
        double expected = 1050.0;
        double result = sut.fullPay(amount, period, percent);
        assertEquals(expected, result);
    }
}