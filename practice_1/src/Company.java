import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Company {

    private ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(Collection<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public double getIncome() {
        double income = 0;
        for (Employee employee : employees) {
            income += employee.getMonthSalary();
        }
        return income;
    }


    public List<Employee> getOperators() {
        return employees.stream()
                .filter(e -> e.getName().equals("Оператор"))
                .collect(Collectors.toList());
    }

    public List<Employee> getTopManagers() {
        return employees.stream()
                .filter(e -> e.getName().equals("Топ-Менеджер"))
                .collect(Collectors.toList());
    }


    // Получение списка сотрудников с наивысшей зарплатой
    public List<Map.Entry<Employee, Double>> getTopSalariesWithNames(int count) {
        if (count < 0) {
            count = 0; // Если count отрицательный, устанавливаем его равным 0
        } else if (count > employees.size()) {
            count = employees.size(); // Если count превышает количество сотрудников, устанавливаем его равным количеству сотрудников
        }
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getMonthSalary).reversed())
                .limit(count)
                .collect(Collectors.toMap(Function.identity(), Employee::getMonthSalary, (e1, e2) -> e1, LinkedHashMap::new))
                .entrySet()
                .stream()
                .collect(Collectors.toList());

    }

    // Получение списка сотрудников с наименьшей зарплатой
    public List<Map.Entry<Employee, Double>> getLowestSalaryWithNames(int count) {
        if (count < 0) {
            count = 0; //Если count отрицательный, устанавливаем его равным 0
        } else if (count > employees.size()) {
            count = employees.size(); // Если count превышает количество сотрудников, устанавливаем его равным количеству сотрудников
        }
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getMonthSalary))
                .limit(count)
                .collect(Collectors.toMap(Function.identity(), Employee::getMonthSalary, (e1, e2) -> e1, LinkedHashMap::new))
                .entrySet()
                .stream()
                .collect(Collectors.toList());
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    //Увольнение 50% сотрудников
    public void fireHalfOfEmployees() {
        int totalEmployees = employees.size();
        int halfEmployees = totalEmployees / 2;

        List<Employee> employeesToFire = employees.stream()
                .limit(halfEmployees)
                .collect(Collectors.toList());

        for (Employee employee : employeesToFire) {
            fire(employee);
        }
    }

    public int getEmployeesCount() {
        return employees.size();
    }

}
