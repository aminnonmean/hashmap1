import java.util.Objects;

public class Address {
    protected String country;
    protected String city;
    public Address(String country, String city) {
        this.city = city;
        this.country = country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object obj) {
        Address a = (Address) obj;
        return country.equals(a.country) && city.equals(a.city);
    }
}
