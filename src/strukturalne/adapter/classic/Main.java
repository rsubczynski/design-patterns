package strukturalne.adapter.classic;

import strukturalne.adapter.classic.UkToContinentalAdapter;
import strukturalne.adapter.device.ContinentalDevice;
import strukturalne.adapter.device.UKDevice;
import strukturalne.adapter.socket.ContinentalSocket;
import strukturalne.adapter.socket.UkSocket;

public class Main {

    public static void main(String[] args) {
        ContinentalDevice radio = () -> System.out.println("Play music");

        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);


        UKDevice ukeRadio = () -> System.out.println("London music calling");

        UkSocket ukSocket = new UkSocket();
        ukSocket.plugIn(ukeRadio);

        UkToContinentalAdapter ukToContinentalAdapter =
                new UkToContinentalAdapter(ukeRadio);

        continentalSocket.plugIn(ukToContinentalAdapter);
    }
}
