import java.util.*;

public class Customer{
    private final String name;
    private final int id;
    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return id == customer.id && name.equals(customer.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
