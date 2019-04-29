package strukturalne.adapter.socket;

import strukturalne.adapter.device.ContinentalDevice;

public class ContinentalSocket {

    public void plugIn(ContinentalDevice continentalDevice){
        continentalDevice.on();
    }
}
