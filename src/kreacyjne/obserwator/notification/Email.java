package kreacyjne.obserwator.notification;

import kreacyjne.obserwator.order.Order;

public class Email implements Observer {

    public void update(Order order) {
        System.out.println("Email - Zamówenie numer =" + order.getOrderNumber()
                + ", zmieniło status na = " + order.getOrderStatus());
    }
}
