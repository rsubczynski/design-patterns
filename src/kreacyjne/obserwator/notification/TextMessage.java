package kreacyjne.obserwator.notification;

import kreacyjne.obserwator.order.Order;

public class TextMessage implements Observer {

    public void update(Order order) {
        System.out.println("SMS - Zamówenie numer =" + order.getOrderNumber()
                + ", zmieniło status na = " + order.getOrderStatus());
    }
}
