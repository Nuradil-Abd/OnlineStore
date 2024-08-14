import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product {

    private String name, description;
    private LocalDateTime createdAt;
    private BigDecimal price;

    public Product() {
    }

    public Product(String name, String description, LocalDateTime createdAt, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
