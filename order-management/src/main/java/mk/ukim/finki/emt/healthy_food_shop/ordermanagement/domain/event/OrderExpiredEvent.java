package mk.ukim.finki.emt.healthy_food_shop.ordermanagement.domain.event;

public class OrderExpiredEvent {
    public String orderId;

    public OrderExpiredEvent(String orderId) {
        this.orderId = orderId;
    }
}