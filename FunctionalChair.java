package ikbo.prak11;

public class FunctionalChair implements Chair {
    FunctionalChair() {}

    int sum(int a, int b) {
        return a + b;
    }

    public String toString() {
        return "It is Functional Chair";
    }
}
