import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        System.out.println("1. " + actual);

        amount = 1_000_000;
        registered = true;
        expected = 500;

        // вызываем целевой метод:
        actual = service.calculate(amount, registered);
        System.out.println("2. " + actual);

    }
}