package mk.ukim.finki.emt.healthy_food_shop.productcatalog.domain.model;

import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.Embeddable;

@Embeddable
public class ProductId extends DomainObjectId {

    public ProductId(String id) {
        super(id);
    }
}
