package behawioralne.chainOfResponsibility.officer;

import behawioralne.chainOfResponsibility.Message;
import behawioralne.chainOfResponsibility.OfficerRank;

public class Sargent extends Officer {

    private static final int CODE = 10;
    private static final String NAME = "Sargent Kowalski";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.SARGENT)
                && message.getCode() == CODE) {
            System.out.println(NAME + " message = " + message.getContent());
        }
        else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
