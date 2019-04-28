package strukturalne.fyweight;

import strukturalne.fyweight.units.Destroyed;
import strukturalne.fyweight.units.RifleMan;
import strukturalne.fyweight.units.TeslaTank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> activeUnits = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            activeUnits.add(new TeslaTank(10,20));
            activeUnits.add(new RifleMan(40,20));
            activeUnits.add(new Destroyed(10,50));
        }
    }

}
