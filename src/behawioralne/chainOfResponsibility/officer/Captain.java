package behawioralne.chainOfResponsibility.officer;

import behawioralne.chainOfResponsibility.Message;
import behawioralne.chainOfResponsibility.OfficerRank;

public class Captain extends Officer {

    private static final int CODE = 50;
    private static final String NAME = "Captain Bomba";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.CAPTAIN)
                && message.getCode() == CODE) {
            System.out.println(NAME + " message = " + message.getContent());
        }
        else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
