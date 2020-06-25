package mk.ukim.finki.emt.healthy_food_shop.ordermanagement.domain.event;

import mk.ukim.finki.emt.healthy_food_shop.ordermanagement.domain.model.OrderItem;

public class OrderItemRemovedFromOrderEvent {
    public String orderId;
    public OrderItem item;

}