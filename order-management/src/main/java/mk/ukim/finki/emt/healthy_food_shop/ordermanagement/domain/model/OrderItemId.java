package mk.ukim.finki.emt.healthy_food_shop.ordermanagement.domain.model;

import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.DomainObjectId;

public class OrderItemId extends DomainObjectId {

    private String id;

    public OrderItemId(String id) {
        super(id);
    }
}
