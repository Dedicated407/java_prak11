package ikbo.prak11;

public class Client {
    private String name;
    public Chair chair;
    Boolean occupied = true;

    Client(String name) {
        this.name = name;
    }

    void sit() {
        if (occupied) {
            System.out.println("Этот стул свободен, садитесь " + name);
            occupied = false;
        }
        else System.out.println("Стул занят.");
    }

    void setChair(Chair chair) {
    }
}
