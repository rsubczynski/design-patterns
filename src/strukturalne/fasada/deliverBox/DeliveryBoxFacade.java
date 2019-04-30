package strukturalne.fasada.deliverBox;

public class DeliveryBoxFacade {

    private DeliveryBox deliveryBox = new DeliveryBox();
    private DeliveryBoxSystem deliveryBoxSystem = new DeliveryBoxSystem();

    public void pickupPackage(){
        deliveryBox.getUserData();
        if(deliveryBoxSystem.isUserDataValidated()
                && deliveryBoxSystem.isPeymentSecured()){
            deliveryBox.openBox();
        }
    }
}
