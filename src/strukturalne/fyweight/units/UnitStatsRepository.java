package strukturalne.fyweight.units;

public class UnitStatsRepository {

    private UnitStatsRepository(){}

    private static UnitStats destroyerUnitStats
            = new UnitStats("Destroyed", 100, 5, 0, 0, 10);

    private static UnitStats rifleManUnitStats
            = new UnitStats("Rifleman", 100, 5, 0, 0, 10);

    private static UnitStats unitStats
            = new UnitStats("Tesla", 100, 5, 0, 0, 10);

    public static UnitStats getDestroyerUnitStats() {
        return destroyerUnitStats;
    }

    public static UnitStats getRifleManUnitStats() {
        return rifleManUnitStats;
    }

    public static UnitStats getUnitStats() {
        return unitStats;
    }

}
