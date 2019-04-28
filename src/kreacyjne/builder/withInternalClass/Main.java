package kreacyjne.builder.withInternalClass;

import kreacyjne.builder.withInternalClass.house.House;

public class Main {

    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildDoors("doors")
                .buildFloors("flooors")
                .build();

        System.out.println(house);
    }
}
