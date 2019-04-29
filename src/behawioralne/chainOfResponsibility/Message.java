package behawioralne.chainOfResponsibility;

public class Message {

    private int code;
    private OfficerRank officerRank;
    private String content;

    public Message(int code, OfficerRank officerRank, String content) {
        this.code = code;
        this.officerRank = officerRank;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public int getCode() {
        return code;
    }

    public OfficerRank getOfficerRank() {
        return officerRank;
    }
}
