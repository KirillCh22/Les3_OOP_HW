public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;

    // СОЗДАЕМ КОНСТРУКТОР КЛАССА
    public Employee(String  name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    // МЕТОД ПОЛУЧЧЕНИЯ ИМЕНИ
    public String GetName() {return name;}

    // МЕТОД ПОЛУЧЕНИЯ ВОЗВРАСТА
    public int GetAge() {return age;}

    // МЕТОД ПОЛУЧЕНИЯ ЗАРПЛАТЫ
    public int GetSalary() {return salary;}


    // МЕТОД ДЛЯ СРАВНЕНИЯ ВОЗРАСТА У 2-х РАБОТНИКОВ
    @Override
    public int compareTo(Employee v) {
        return Integer.compare(this.age, v.GetAge());
    }


    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary;
    }
}
