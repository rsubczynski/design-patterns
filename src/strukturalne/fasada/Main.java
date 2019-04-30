package strukturalne.fasada;

import strukturalne.fasada.deliverBox.DeliveryBoxFacade;

public class Main {

    public static void main(String[] args) {
        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();
    }


}
