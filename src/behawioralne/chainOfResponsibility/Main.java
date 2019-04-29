package behawioralne.chainOfResponsibility;


import behawioralne.chainOfResponsibility.officer.Captain;
import behawioralne.chainOfResponsibility.officer.General;
import behawioralne.chainOfResponsibility.officer.Officer;
import behawioralne.chainOfResponsibility.officer.Sargent;

public class Main {

    public static void main(String[] args) {
        Message message = new Message(100 ,OfficerRank.GENERAL,"Attack!!");

        Officer sargent = new Sargent();
        Officer captain = new Captain();
        Officer general = new General();

        sargent.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sargent.processMessage(message);

    }
}
