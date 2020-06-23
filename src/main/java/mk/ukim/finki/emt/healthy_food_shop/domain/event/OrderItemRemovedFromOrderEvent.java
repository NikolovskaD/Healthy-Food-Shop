package mk.ukim.finki.emt.healthy_food_shop.domain.event;

import mk.ukim.finki.emt.healthy_food_shop.domain.model.OrderItem;

public class OrderItemRemovedFromOrderEvent {
    public String orderId;
    public OrderItem item;

}
