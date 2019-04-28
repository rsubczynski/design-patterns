package kreacyjne.abstractFactory;

import kreacyjne.abstractFactory.units.*;

public class Main {

    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory refFactory = new RefFactory();

        MechanizeUnit tank = blueFactory.createMechanizeUnit(UnitType.TANK);
        InfantryUnit rif = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);


    }
}
