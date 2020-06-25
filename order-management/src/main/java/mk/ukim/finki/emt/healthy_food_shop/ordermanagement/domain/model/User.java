package mk.ukim.finki.emt.healthy_food_shop.ordermanagement.domain.model;

import lombok.Getter;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.location.Address;

import javax.persistence.*;

@Entity
@Table(name="users")
@Getter
public class User extends AbstractEntity<UserId> {

    @EmbeddedId
    private UserId id;

    @Version
    private Long version;

    private String name;

    private String surname;

    @Embedded
    private Address address;

    private String eMail;

    private String username;

    private String password;

    @Override
    public UserId id() {
        return id;
    }
}
