package challenges;
import java.time.LocalDate;

public class Order {

    private final User user;
    private final String produkt;
    private final int quantity;
    private final LocalDate dateOFOrder;
    private final boolean isOrdered;

    public  Order(User user, String produkt, int quantity, LocalDate dateOFOrder, boolean isOrdered) {
        this.user = user;
        this.produkt = produkt;
        this.quantity = quantity;
        this.dateOFOrder = dateOFOrder;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public String getProdukt() {
        return produkt;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getDateOFOrder() {
        return dateOFOrder;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
