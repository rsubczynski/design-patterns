package behawioralne.obserwator;

import behawioralne.obserwator.notification.Email;
import behawioralne.obserwator.notification.MobileApp;
import behawioralne.obserwator.notification.TextMessage;
import behawioralne.obserwator.order.Order;
import behawioralne.obserwator.order.OrderStatus;

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
