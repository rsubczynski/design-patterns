package kreacyjne.builder.classic;


import kreacyjne.builder.classic.house.House;
import kreacyjne.builder.classic.house.HouseDirector;
import kreacyjne.builder.classic.house.SmallHouseBuilder;

public class Main {

    public static void main(String[] args) {
        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();

        HouseDirector houseDirector = new HouseDirector(smallHouseBuilder);
        houseDirector.buildHouse();
        House house = houseDirector.getHouse();
        System.out.println(house);


    }
}
