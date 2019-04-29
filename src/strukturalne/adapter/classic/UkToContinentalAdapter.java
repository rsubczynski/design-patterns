package strukturalne.adapter.classic;

import strukturalne.adapter.device.ContinentalDevice;
import strukturalne.adapter.device.UKDevice;

public class UkToContinentalAdapter implements ContinentalDevice {

    private UKDevice ukDevice;

    public UkToContinentalAdapter(UKDevice ukDevice) {
        this.ukDevice = ukDevice;
    }

    @Override
    public void on() {
        ukDevice.powerOn();
    }
}
