package ikbo.prak11;

public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        System.out.println(chairFactory.createVictorianChair());
        System.out.println(chairFactory.createMagicanChair());
        System.out.println(chairFactory.createFunctionalChair());

        System.out.println(chairFactory.createVictorianChair().getAge());
        chairFactory.createMagicanChair().doMagic();
        System.out.println("Кол-во стулов: " + chairFactory.createFunctionalChair().sum(2,4));

        Client client = new Client("Ilya");
        client.sit();
        client.sit();
    }
}


/*
Реализовать класс Абстрактная фабрика для различных типов стульев:
Викторианский стул, Многофункциональный стул, Магический стул, а также интерфейс Стул,
от которого наследуются все классы стульев, и класс Клиент, который использует интерфейс стул в своем методе Sit (Chair chair).
*/