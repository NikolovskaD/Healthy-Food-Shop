package mk.ukim.finki.emt.healthy_food_shop.ordermanagement.domain.model;

import lombok.Getter;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.financial.Currency;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.financial.Money;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.location.Address;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Entity
@Table(name="orders")
@Getter
public class Order extends AbstractEntity<OrderId> {

    @EmbeddedId
    private OrderId id;

    @Version
    private Long version;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;

    @Embedded
    private Address address;

    @Embedded
    private Money amount;

    private Instant orderedOn;

    @Enumerated(value = EnumType.STRING)
    private Currency currency;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<OrderItem> items;

    @ManyToOne
    private User user;

    @Override
    public OrderId id() {
        return id;
    }
}
