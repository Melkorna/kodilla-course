package challenges;

import java.time.LocalDate;

public class OrderApplication {
    public static void main(String[] args) {

        InformUseService informationService = new InformServeOrder();
        OrderService orderService = new ProductOrderService();
        OrderProcess orderProcessor = new OrderProcess(informationService, orderService);
        orderProcessor.process(new User("Olek", "Orlowski"), "GPU GTX 1070", 1, LocalDate.ofYearDay(2021, 254), true);

    }
}