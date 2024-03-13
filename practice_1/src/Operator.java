import java.util.Random;

public class Operator implements Employee {
    private double fixedSalary;

    public Operator() {
        Random random = new Random();
        // Фиксированная зарплата от 50000 до 55000 рублей
        this.fixedSalary = 50000 + random.nextInt(501);
    }

    @Override
    public double getMonthSalary() {
        return fixedSalary;
    }

    @Override
    public String getName() {
        return "Оператор";
    }
}
