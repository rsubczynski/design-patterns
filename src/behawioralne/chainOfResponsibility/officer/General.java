package behawioralne.chainOfResponsibility.officer;

import behawioralne.chainOfResponsibility.Message;
import behawioralne.chainOfResponsibility.OfficerRank;

public class General extends Officer {

    private static final int CODE = 100;
    private static final String NAME = "General Raduś";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.GENERAL)
                && message.getCode() == CODE) {
            System.out.println(NAME + " message = " + message.getContent());
        }
        else {
            System.out.println("Error");
        }
    }
}
