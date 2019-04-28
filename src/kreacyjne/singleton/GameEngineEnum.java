package kreacyjne.singleton;

public enum GameEngineEnum {

    INSTANCE("Duke");

    private int hp = 100;
    private String characterName = "";

    GameEngineEnum(String name) {
        characterName = name;
    }

    public void run() {
        while (true) {

        }
    }
}
