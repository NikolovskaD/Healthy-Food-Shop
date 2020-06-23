package mk.ukim.finki.emt.healthy_food_shop.domain.model;

import mk.ukim.finki.emt.healthy_food_shop.domain.valueObj.Money;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String status;
    private Money amount;
    private LocalDateTime expiryTime;

    //@AggregateMember
    private List<OrderItem> items = new ArrayList<>();

    @ManyToOne
    private User user;
}
