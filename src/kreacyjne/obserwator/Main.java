package kreacyjne.obserwator;

import kreacyjne.obserwator.notification.Email;
import kreacyjne.obserwator.notification.MobileApp;
import kreacyjne.obserwator.notification.TextMessage;
import kreacyjne.obserwator.order.Order;
import kreacyjne.obserwator.order.OrderStatus;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(1L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("-------------------------->");
        order.changeOrderStatus(OrderStatus.SENT);

    }
}
