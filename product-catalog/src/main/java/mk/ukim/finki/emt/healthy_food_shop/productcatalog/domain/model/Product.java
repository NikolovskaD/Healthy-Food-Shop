package mk.ukim.finki.emt.healthy_food_shop.productcatalog.domain.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.DomainObjectId;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.financial.Money;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "products")
@Where(clause = "deleted=false")
public class Product extends AbstractEntity<ProductId> {

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
    private boolean deleted;

    @ManyToOne
    @NotNull
    private Manufacturer manufacturer;

    public Product() {
    }

    public Product(@NonNull String name, @NonNull Money price, @NonNull int quantity, @NonNull String category,
                   @NonNull String imgUrl, @NonNull Manufacturer manufacturer) {
        super(DomainObjectId.randomId(ProductId.class));
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.imgUrl = imgUrl;
        this.manufacturer = manufacturer;
        deleted = false;
    }

    public void subtractQuantity(int qnt) {
        if (qnt > this.quantity) {
            throw new RuntimeException("unsupported quantity");
        }
        this.quantity -= qnt;
    }

    public void addQuantity(int qnt) {
        this.quantity += qnt;
    }

    @Override
    public ProductId id() {
        return id;
    }

}
