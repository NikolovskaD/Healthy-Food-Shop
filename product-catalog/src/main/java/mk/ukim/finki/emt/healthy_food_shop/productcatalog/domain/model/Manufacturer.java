package mk.ukim.finki.emt.healthy_food_shop.productcatalog.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.location.Address;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manufacturers")
@Getter
public class Manufacturer extends AbstractEntity<ManufacturerId> {

    @EmbeddedId
    private ManufacturerId id;

    private String name;

    @Embedded
    private Address address;

    @JsonIgnore
    @OneToMany(mappedBy = "manufacturer")
    private List<Product> productList;

    @Override
    public ManufacturerId id() {
        return null;
    }
}
