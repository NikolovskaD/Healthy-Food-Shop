package mk.ukim.finki.emt.healthy_food_shop.domain.event;

import mk.ukim.finki.emt.healthy_food_shop.domain.model.Product;

import java.time.LocalDateTime;

public class OrderCreatedEvent {
    public String orderId;
    public LocalDateTime orderExpiry;
    public Product product;

    public OrderCreatedEvent(String orderId, LocalDateTime orderExpiry, Product product) {
        this.orderId = orderId;
        this.orderExpiry = orderExpiry;
        this.product = product;
    }
}
