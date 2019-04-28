package behawioralne.obserwator.notification;

import behawioralne.obserwator.order.Order;

public class MobileApp implements Observer {

    public void update(Order order) {
        System.out.println("Mobilna aplikacja - Zamówenie numer =" + order.getOrderNumber()
                + ", zmieniło status na = " + order.getOrderStatus());
    }
}
