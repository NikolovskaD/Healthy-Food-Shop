package mk.ukim.finki.emt.healthy_food_shop.domain.event;

import mk.ukim.finki.emt.healthy_food_shop.domain.model.OrderItem;

public class OrderItemAddedToOrderEvent {
    public String orderId;
    public OrderItem item;
    public Double productPrice;

    public OrderItemAddedToOrderEvent(String orderId, OrderItem item, Double productPrice){
        this.orderId = orderId;
        this.item = item;
    }
}
