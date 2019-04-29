package strukturalne.adapter.twoWayAdapter;

import strukturalne.adapter.device.ContinentalDevice;
import strukturalne.adapter.device.UKDevice;
import strukturalne.adapter.socket.ContinentalSocket;
import strukturalne.adapter.socket.UkSocket;

public class Main {

    public static void main(String[] args) {
        ContinentalDevice radio = () -> System.out.println("Play music");

        ContinentalSocket continentalSocket = new ContinentalSocket();

        UKDevice ukRadio = () -> System.out.println("London music calling");

        UkSocket ukSocket = new UkSocket();

        TwoWayAdapter twoWayAdapter =
                new TwoWayAdapter(ukRadio, radio);

        continentalSocket.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);
    }

}
