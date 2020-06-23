package mk.ukim.finki.emt.healthy_food_shop.domain.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    private long id;

    @NotNull
    private String name;

    private Double price;
    private String category;
    private String imgUrl;

    @ManyToOne
    @NotNull
    private Manufacturer manufacturer;
}
