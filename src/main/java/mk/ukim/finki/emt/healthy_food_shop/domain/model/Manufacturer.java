package mk.ukim.finki.emt.healthy_food_shop.domain.model;

import mk.ukim.finki.emt.healthy_food_shop.domain.valueObj.Address;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manufacturers")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private Address address;
    private List<Product> productList;
}
