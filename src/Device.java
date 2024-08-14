import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Device extends Product {

    private String brand, color;
    private boolean isNew;
    private int memory;


    public Device() {
    }

    public Device(String brand, String color, boolean isNew, int memory) {
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }

    public Device(String name, String description, LocalDateTime createdAt, BigDecimal price, String brand, String color, boolean isNew, int memory) {
        super(name, description, createdAt, price);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }
}
