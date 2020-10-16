package ikbo.prak11;

public class MagicChair implements Chair {
    MagicChair() {}

    void doMagic() {
        System.out.println("У меня три ножки");
    }

    public String toString() {
        return "It is magic Chair!";
    }
}
