package strukturalne.adapter.twoWayAdapter;

import strukturalne.adapter.device.ContinentalDevice;
import strukturalne.adapter.device.UKDevice;

public class TwoWayAdapter implements ContinentalDevice, UKDevice {

    private UKDevice ukDevice;
    private ContinentalDevice continentalDevice;

    public TwoWayAdapter(UKDevice ukDevice, ContinentalDevice continentalDevice) {
        this.ukDevice = ukDevice;
        this.continentalDevice = continentalDevice;
    }

    @Override
    public void on() {
        ukDevice.powerOn();
    }

    @Override
    public void powerOn() {
        continentalDevice.on();
    }
}
