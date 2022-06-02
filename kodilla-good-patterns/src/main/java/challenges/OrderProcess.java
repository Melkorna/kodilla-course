package challenges;
import java.time.LocalDate;

public class OrderProcess {
    private final InformUseService informUseService;
    private  final  OrderService orderService;

    public OrderProcess(InformUseService informUseService, OrderService orderService) {
        this.informUseService = informUseService;
        this.orderService = orderService;
    }
    public Order process (User user, String produkt, int quantity, LocalDate dateOFOrder, boolean isOrdered) {
        boolean isProduktOrdered = orderService.order(new Order(user, produkt, quantity, dateOFOrder, isOrdered));
        if (isProduktOrdered){
            informUseService.inform(user);
        return new Order(user, produkt, quantity, dateOFOrder, true);
    }else{
            return new Order(user,produkt,quantity,dateOFOrder,false);
        }
    }
}
