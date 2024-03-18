import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        MyLinkedList smartphones = new MyLinkedList();

        smartphones.AddElement(0, "Apple");
        smartphones.AddElement(1, "Samsung");
        smartphones.AddElement(2, "Huawei");
        smartphones.AddElement(3, "Oppo");

        System.out.println("|Первая часть задания|");

        for  (String smartphone : smartphones) {
            System.out.println(smartphone);
        }

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        smartphones.RemoveElement("Oppo");

        for (String smarphone : smartphones) {
            System.out.println(smarphone);
        }


        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println(smartphones.GetElement(0));
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        System.out.println("|Вторая часть задания|");
        Employee employee1 = new Employee("Павел", 27, 65000);
        Employee employee2 = new Employee("Илья", 29, 79000);
        Employee employee3 = new Employee("Алексей", 35, 125000);
        Employee employee4 = new Employee("Олег", 32, 50000);


/*        compareTo возвращает в качестве результата сравнения целое число:
         1) > 0 - если вызывающий объект больше объекта переданного в качетсве параметра
         2) < 0 - если вызывающий объект меньше объекта переданного в качестве параметра
         3) = 0 - если оба равны                                                            */
        if(employee4.compareTo(employee2) > 0) System.out.format("Возраст %s больше возраста %s", employee4.GetName(), employee2.GetName());
        else if (employee4.compareTo(employee2) == 0) System.out.format("Возраст %s равен возрасту %s", employee4.GetName(), employee2.GetName());
        else System.out.format("Возраст %s меньше возраста %s", employee4.GetName(), employee2.GetName());

        System.out.println();
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);

        // СОРТИРОВКА СПИСКА(по увеличению зарплаты)  С ПОМОЩЬЮ СОЗДАННОГО КОМПАРАТОРА
        Collections.sort(arrayList, new EmployeeSalaryComparator());

        for (Employee employee : arrayList) {
            System.out.println(employee);
        }










    }
}