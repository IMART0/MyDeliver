package am.martirosyan.mydeliver.model;

    import com.fasterxml.jackson.annotation.JsonManagedReference;
    import jakarta.persistence.*;
    import lombok.*;

    import java.util.Set;

    @Entity
    @Table(name = "orders")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "order_date")
        private String orderDate;

        @Column(name = "status")
        private String status;

        @Column(name = "user_id")
        private Long userId;

        @Column(name = "total_price")
        private double totalPrice;

        @Column(name = "payment_type")
        private String paymentType;

        @Column(name = "is_deleted")
        private boolean deleted;

        @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
        @JsonManagedReference
        private Set<OrderItem> orderItems;
    }