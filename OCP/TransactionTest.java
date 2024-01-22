package OCP;

import java.math.BigDecimal;
import java.util.Arrays;

public class TransactionTest {
    public static void main(String[] args) {

        TransactionManager manager = new TransactionManager(
                Arrays.asList(new DailyLimitRule(), new WorkingHoursRule())
        );

        var t1 = new Transaction(new BigDecimal("1000"), "ADA");

        manager.executeTrade(t1);
    }
}