package OCP;
import java.math.BigDecimal;
public interface TransactionRule {
    void validate(Transaction transaction);
}
