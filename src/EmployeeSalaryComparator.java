import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee v1, Employee v2) {
        return Integer.compare(v1.GetSalary(), v2.GetSalary());
    }
}
