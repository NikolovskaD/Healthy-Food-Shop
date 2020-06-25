package mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.location;

import lombok.Getter;
import mk.ukim.finki.emt.healthy_food_shop.sharedkernel.domain.base.ValueObject;
import org.springframework.lang.NonNull;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Getter
public class Address implements ValueObject {

    private final String street;

    private final String streetNumber;

    private final String city;

    private final String country;

    private final Integer zipCode;

//    protected Address(){
//    }

    public Address(@NonNull String street, @NonNull String streetNumber, @NonNull String city, @NonNull String country,
                   @NonNull Integer zipCode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return street.equals(address.street) &&
                streetNumber.equals(address.streetNumber) &&
                city.equals(address.city) &&
                country.equals(address.country) &&
                zipCode.equals(address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, streetNumber, city, country, zipCode);
    }

    @Override
    public String toString() {
        return street + " " + streetNumber + ", " + city + ", " + country + ", " + zipCode;
    }
}
