package strukturalne.fasada.deliverBox;

class DeliveryBox {

    boolean isDeliverBoxFull(){
        System.out.println("Delivery Box is not full");
        return false;
    }

    boolean isDeliveryBoxBroken(){
        System.out.println("Delivery box is not broken");
        return false;
    }

    void getUserData(){
        System.out.println("User data entered");
    }

    void openBox(){
        System.out.println("Box opened");
    }
}
