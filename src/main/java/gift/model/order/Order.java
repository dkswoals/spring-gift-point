package gift.model.order;

import gift.model.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @Column
    private Long targetId;
    @Column
    private Long itemId;
    @Column
    private Long optionId;
    @Column
    private Long quantity;
    @Column
    private String message;
    @Column
    private LocalDateTime orderDateTime;

    public Order() {
    }

    public Order(Long id, User user, Long targetId, Long itemId, Long optionId, Long quantity,
        String message, LocalDateTime orderDateTime) {
        this.id = id;
        this.user = user;
        this.targetId = targetId;
        this.itemId = itemId;
        this.optionId = optionId;
        this.quantity = quantity;
        this.message = message;
        this.orderDateTime = orderDateTime;
    }

    public Order(User user, Long targetId, Long itemId, Long optionId, Long quantity,
        String message,
        LocalDateTime orderDateTime) {
        this(null, user, targetId, itemId, optionId, quantity, message, orderDateTime);
    }


    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Long getTargetId() {
        return targetId;
    }

    public Long getItemId() {
        return itemId;
    }

    public Long getOptionId() {
        return optionId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }
}
