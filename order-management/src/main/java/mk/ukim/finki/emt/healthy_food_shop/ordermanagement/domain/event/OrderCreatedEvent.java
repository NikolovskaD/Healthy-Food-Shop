package mk.ukim.finki.emt.healthy_food_shop.ordermanagement.domain.event;

import lombok.Getter;
import mk.ukim.finki.emt.healthy_food_shop.ordermanagement.domain.model.OrderId;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.DomainEvent;

import java.time.Instant;

@Getter
public class OrderCreatedEvent implements DomainEvent {
    //ne cuvame duplikati na entiteti - da ne ja gusime bazata
    // gi cuvame samo identifikatorite

    private final OrderId orderId;
    private final Instant occuredOn;

    public OrderCreatedEvent(OrderId orderId, Instant occuredOn) {
        this.orderId = orderId;
        this.occuredOn = occuredOn;
    }

    @Override
    public Instant occurredOn(){
        return occuredOn;
    };


    /*public String orderId;
    public LocalDateTime orderExpiry;
    public Product product;

    public OrderCreatedEvent(String orderId, LocalDateTime orderExpiry, Product product) {
        this.orderId = orderId;
        this.orderExpiry = orderExpiry;
        this.product = product;
    }*/
}
