package behawioralne.templateMethod;

public abstract class CarStartingSequence {

    public final void startingSeguence(){
        fastenSeatbelts();
        statTheIngitation();
        setTheGear();
        go();
    }

    protected abstract void setTheGear();

    protected abstract void statTheIngitation();

    private void go() {
        System.out.println("Wciskamy gaz");
    }

    private void fastenSeatbelts() {
        System.out.println("Zapinamy passy");
    }
}
