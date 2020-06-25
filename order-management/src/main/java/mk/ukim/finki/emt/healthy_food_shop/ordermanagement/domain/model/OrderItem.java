package mk.ukim.finki.emt.healthy_food_shop.ordermanagement.domain.model;

import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem extends AbstractEntity<OrderItemId> {

    @EmbeddedId
    private OrderItemId id;

    private Integer quantity;

//    @ManyToOne
//    private Product product;

    @Override
    public OrderItemId id() {
        return id;
    }
}
