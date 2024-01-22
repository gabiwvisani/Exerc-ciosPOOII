package OCP;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class WorkingHoursRule implements TransactionRule {

    @Override
    public void validate(Transaction transaction) {
        LocalDateTime limit = LocalDateTime.of(2024, 1, 19, 22, 0, 0);
        if (transaction.getCreated().isAfter(limit)) {
            throw new RuntimeException("Invalid transaction: after working hours");
        }
    }
}
