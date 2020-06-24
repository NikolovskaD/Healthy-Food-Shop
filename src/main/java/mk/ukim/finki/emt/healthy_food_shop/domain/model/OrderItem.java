package mk.ukim.finki.emt.healthy_food_shop.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

    @Id
    private String id;

    private Integer quantity;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Order order;
}
