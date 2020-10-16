package ikbo.prak11;

public class ChairFactory implements AbstractChairFactory {

    ChairFactory() {}

    public VictorianChair createVictorianChair() {
        return new VictorianChair(15);
    }

    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
