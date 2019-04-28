package kreacyjne.factory;

import kreacyjne.factory.units.Factory;
import kreacyjne.factory.units.Unit;
import kreacyjne.factory.units.UnitFactory;
import kreacyjne.factory.units.UnitType;

public class Main {

    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rif = factory.createUnit(UnitType.RIFLEMAN);
    }
}
