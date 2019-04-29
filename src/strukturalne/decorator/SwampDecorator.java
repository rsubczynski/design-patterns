package strukturalne.decorator;

public class SwampDecorator extends TerrainDecorator {
    public SwampDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        return super.getFuelCost() + 15;
    }
}
