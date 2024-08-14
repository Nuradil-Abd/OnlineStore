import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Book extends Product {

    private String authorFullName;

    public Book() {
    }

    public Book(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public Book(String name, String description, LocalDateTime createdAt, BigDecimal price, String authorFullName) {
        super(name, description, createdAt, price);
        this.authorFullName = authorFullName;
    }
}
