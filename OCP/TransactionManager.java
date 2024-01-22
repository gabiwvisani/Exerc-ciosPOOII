package OCP;

import java.math.BigDecimal;
import java.util.List;

public class TransactionManager {

    private final List<TransactionRule> rules;

    public TransactionManager(List<TransactionRule> rules) {
        this.rules = rules;
    }

    void executeTrade(Transaction transaction) {
        validateTransaction(transaction);
        transact(transaction);
    }

    private void validateTransaction(Transaction transaction) {
        for (TransactionRule rule : rules) {
            rule.validate(transaction);
        }
    }

    private void transact(Transaction transaction) {
        System.out.println("Transaction succeed: " + transaction);
    }

}
