package kreacyjne.singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private int ph;
    private String charakterName = "";

    private static GameEngine instance = new GameEngine();

    private GameEngine() {
    }

    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    public void run() {
        while (true) {

        }
    }

    protected Object readResolve(){
        return getInstance();
    }
}
