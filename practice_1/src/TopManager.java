import java.util.Random;

public class TopManager implements Employee {
    private double fixedSalary;
    private double bonus;
    private double companyIncome;

    public TopManager() {
        Random random = new Random();
        // Фиксированная зарплата от 200000 до 250000 рублей
        this.fixedSalary = 200000 + random.nextInt(50001);
        // Доход компании от 10000000 до 14000000 рублей
        this.companyIncome = 10000000 + random.nextInt(4000001);
        // Бонус в виде 150% от заработной платы, если доход компании более 10 млн рублей
        this.bonus = companyIncome > 10000000 ? fixedSalary * 1.5 : 0;
    }

    @Override
    public double getMonthSalary() {
        return fixedSalary + bonus;
    }

    @Override
    public String getName() {
        return "Топ-Менеджер";
    }
}
