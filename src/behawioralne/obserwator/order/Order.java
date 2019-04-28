package behawioralne.obserwator.order;

import behawioralne.obserwator.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {

    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registersObservers = new HashSet<>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    private void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObserver(Observer observer) {
        registersObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registersObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        registersObservers.forEach(observer ->
                observer.update(this));
    }

    public void changeOrderStatus(OrderStatus orderStatus){
       setOrderStatus(orderStatus);
       notifyObservers();
    }
}
