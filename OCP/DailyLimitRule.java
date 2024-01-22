package OCP;
import java.math.BigDecimal;
//import java.time.LocalDateTime;
public class DailyLimitRule implements TransactionRule {

    private static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal("1000");

    @Override
    public void validate(Transaction transaction) {
        if (transaction.getAmount().compareTo(MAX_DAILY_LIMIT) > 0) {
            throw new RuntimeException("Invalid transaction: max limit");
        }
    }
}