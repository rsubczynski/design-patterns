package strukturalne.fyweight.units;

public class Destroyed {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public Destroyed(int x, int y) {
        stats = UnitStatsRepository.getDestroyerUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHpLeft() {
        return hpLeft;
    }

    public UnitStats getStats() {
        return stats;
    }
}
