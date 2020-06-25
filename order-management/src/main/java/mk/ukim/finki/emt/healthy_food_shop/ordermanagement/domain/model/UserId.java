package mk.ukim.finki.emt.healthy_food_shop.ordermanagement.domain.model;

import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;

@Embeddable
public class UserId extends DomainObjectId {

    public UserId(String id) {
        super(id);
    }
}