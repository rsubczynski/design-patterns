package behawioralne.obserwator.notification;

import behawioralne.obserwator.order.Order;

public interface Observer {
    void update(Order order);
}
