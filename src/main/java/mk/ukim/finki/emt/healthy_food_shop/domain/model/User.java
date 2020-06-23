package mk.ukim.finki.emt.healthy_food_shop.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private long id;
    private String name;
    private String surname;
    private String Address;
    private String eMail;
    private String username;
    private String password;
}
