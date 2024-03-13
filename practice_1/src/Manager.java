import java.util.Random;

public class Manager implements Employee {
    private double fixedSalary;
    private double bonus;
    private double companyEarnings;
    public Manager() {
        Random random = new Random();
        // Фиксированная зарплата от 100000 до 120000 рублей
        this.fixedSalary = 100000 + random.nextInt(21001);
        // Заработанные для компании денеги от 115000 до 140000 рублей
        this.companyEarnings = 115000 + random.nextInt(26001);
        // Бонус в виде 5% от заработанных для компании денег
        this.bonus = companyEarnings * 0.05;
    }

    @Override
    public double getMonthSalary() {
        return fixedSalary + bonus;
    }

    @Override
    public String getName() {
        return "Менеджер";
    }
}
