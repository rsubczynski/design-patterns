package kreacyjne.obserwator.notification;

import kreacyjne.obserwator.order.Order;

public interface Observer {
    void update(Order order);
}
