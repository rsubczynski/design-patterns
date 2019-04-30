package strukturalne.fasada.deliverBox;

class DeliveryBoxSystem {

    void sendNotyfication(){
        System.out.println("Text message sent do the client");
    }

    boolean isPeymentSecured(){
        System.out.println("Payment has been secured");
        return true;
    }

    boolean isUserDataValidated(){
        System.out.println("User data has been validated");
        return true;
    }

    void scheduleDelivery(){
        System.out.println("Delivery has been scheduled");
    }
}
