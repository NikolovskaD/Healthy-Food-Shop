package mk.ukim.finki.emt.healthy_food_shop.ordermanagement.domain.model;

import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.DomainObjectId;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.location.Address;

import javax.persistence.*;

@Entity
@Table(name="users")
@Getter
public class User extends AbstractEntity<UserId> {

    @Version
    private Long version;

    private String name;

    private String surname;

    @Embedded
    private Address address;

    private String eMail;

    private String username;

    private String password;

    public User() {
    }

    public User(@NonNull String name, @NonNull String surname, @NonNull Address address, @NonNull String eMail,
                @NonNull String username, @NonNull String password) {
        super(DomainObjectId.randomId(UserId.class));
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.eMail = eMail;
        this.username = username;
        this.password = password;
    }

    @Override
    public UserId id() {
        return id;
    }
}
