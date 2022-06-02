package challenges;

public class ProductOrderService implements OrderService{

    public boolean order (Order order){
        System.out.println(order.getUser().getUserName() + " " + order.getUser().getUserSurName() + " " + order.getProdukt() + " " + order.getQuantity() + order.getDateOFOrder());
        return true;
    }
}
