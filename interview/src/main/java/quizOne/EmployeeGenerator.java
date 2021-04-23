package quizOne;

import quizOne.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeGenerator {
    ArrayList<Employee> employeeArrayList=new ArrayList<Employee>();

    public ArrayList<Employee> getAllList(){
        employeeArrayList.addAll(Arrays.asList(
                new Employee(1,"pamal1",1000,"abc1",25,4),
                new Employee(2,"pamal2",1000,"abc2",25,4),
                new Employee(3,"pamal3",1000,"abc3",25,4),
                new Employee(4,"pamal4",1000,"abc4",25,4),
                new Employee(5,"pamal5",1000,"abc5",25,4),
                new Employee(6,"pamal6",1000,"abc6",25,4),
                new Employee(7,"pamal7",1000,"abc7",25,4),
                new Employee(8,"pamal8",1000,"abc8",25,4),
                new Employee(9,"pamal9",1000,"abc9",25,4),
                new Employee(10,"pamal10",1000,"abc10",25,4),

                new Employee(11,"pamal11",1000,"abc11",25,5),
                new Employee(12,"pamal12",1000,"abc12",25,5),
                new Employee(13,"pamal13",1000,"abc13",25,5),
                new Employee(14,"pamal14",1000,"abc14",25,5),
                new Employee(15,"pamal15",1000,"abc15",25,5),

                new Employee(16,"pamal16",1000,"abc16",26,6),
                new Employee(17,"pamal17",1000,"abc17",26,6),
                new Employee(18,"pamal18",1000,"abc18",26,6),
                new Employee(19,"pamal19",1000,"abc19",26,6),
                new Employee(20,"pamal20",1000,"abc20",26,6)

                ));

        return employeeArrayList;
    }
}
