import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        // найм 180 оеператоров
        for (int i = 0; i < 180; i++) {
            company.hire(new Operator()); // Фиксированная зарплата 50000
        }

        // Найм 80 менеджеров по продажам

        for (int i = 0; i < 80; i++) {
            company.hire(new Manager()); // Фиксированная зарплата 100000
        }

        //Найм 10 топ-менеджеров

        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager()); //Фиксированная зарплата 200000 рублей, доход компании 12000000 рублей
        }

//        // Вывод списка операторов до увольнения
//        List<Employee> operatorsBefore = company.getOperators();
//        System.out.println("\nСписок операторов до увольнения:");
//        for (Employee operator : operatorsBefore) {
//            System.out.println(operator.getName());
//        }

        // Вывод списка топ-менеджеров до увольнения
        List<Employee> topManagersBefore = company.getTopManagers();
        System.out.println("\nСписок топ-менеджеров до увольнения:");
        for (Employee topManager : topManagersBefore) {
            System.out.println(topManager.getName());
        }

//        // Вывод списка из 10-15 самых высоких зарплат в компании
//        List<Map.Entry<Employee, Double>> topSalaries = company.getTopSalariesWithNames(15);
//        System.out.println("\nСписок из 10-15 самых высоких зарплат:");
//        for (Map.Entry<Employee, Double> entry : topSalaries) {
//            System.out.println(String.format("%s: %.2f руб.", entry.getKey().getName(), entry.getValue()));
//        }

//        // Вывод списка из 30 самых низких зарплат в компании
//        List<Map.Entry<Employee, Double>> lowestSalaries = company.getLowestSalaryWithNames(30);
//        System.out.println("\nСписок из 30 самых низких зарплат:");
//        for (Map.Entry<Employee, Double> entry : lowestSalaries) {
//            System.out.println(String.format("%s: %.2f руб", entry.getKey().getName(), entry.getValue()));
//        }

        // Увольнение 50% сотрудников
        company.fireHalfOfEmployees();


//        // Вывод списка операторов после увольнения
//        List<Employee> operatorsAfter = company.getOperators();
//        System.out.println("\nСписок операторов после увольнения:");
//        for (Employee operator : operatorsAfter) {
//            System.out.println(operator.getName());
//        }

        // Вывод списка топ-менеджеров после увольнения
        List<Employee> topManagersAfter = company.getTopManagers();
        System.out.println("\nСписок топ-менеджеров после увольнения:");
        for (Employee topManager : topManagersAfter) {
            System.out.println(topManager.getName());
        }

//        // Вывод списка из 10-15 самых высоких зарплат после увольнения
//        topSalaries = company.getTopSalariesWithNames(15);
//        System.out.println("\nСписок из 10-15 самых высоких зарплат после увольнения:");
//        for (Map.Entry<Employee, Double> entry : topSalaries) {
//            System.out.println(String.format("%s: %.2f руб.", entry.getKey().getName(), entry.getValue()));
//        }

//        // Вывод списка из 30 самых низких зарплат после увольнения
//        lowestSalaries = company.getLowestSalaryWithNames(30);
//        System.out.println("\nСписок из 30 самых низких зарплат после увольнения:");
//        for (Map.Entry<Employee, Double> entry : lowestSalaries) {
//            System.out.println(String.format("%s: %.2f руб.", entry.getKey().getName(), entry.getValue()));
//        }

    }

}
