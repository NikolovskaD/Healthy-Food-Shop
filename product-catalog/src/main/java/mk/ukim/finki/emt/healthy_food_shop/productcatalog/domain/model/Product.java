package mk.ukim.finki.emt.healthy_food_shop.productcatalog.domain.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.financial.Money;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Currency;

@Entity
@Getter
@Table(name = "products")
@Where(clause = "deleted=false")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Version
    private long version;

    @NotNull
    private String name;

    @Embedded
    private Money price;

    private int quantity;

    private String category;

    private String imgUrl;

    @NotNull
    private boolean deleted = false;

//    @ManyToOne
//    @NotNull
//    private Manufacturer manufacturer;
}
