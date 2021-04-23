package quizOne;

import quizOne.Employee;
import quizOne.EmployeeGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> listOfEmployees = getAllEmployeeList();
//        categorizingEmployeeByAge(listOfEmployees);
//        categorizingEmployeeByRate(listOfEmployees);

        listOfEmployees.stream()
                .map(employee -> employee.getAge())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((employee, aLong) -> {
                    System.out.println(employee+"="+aLong);
                });

        listOfEmployees.stream()
                .map(employee -> employee.getRating())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((employee, aLong) -> {
                    System.out.println(employee+"="+aLong);
                });
    }

    private static void categorizingEmployeeByRate(ArrayList<Employee> listOfEmployees) {
        Set<Integer> ratingCategoryEmployeeSet = getRatingCategories(listOfEmployees);
        Map<Integer, Long> ratingCategoryList = getListOfCountsOfEmployeesCategorizingByRating(listOfEmployees, ratingCategoryEmployeeSet);
        printRateCategoryList(ratingCategoryList);
    }

    private static void printRateCategoryList(Map<Integer, Long> ratingCategoryList) {
        System.out.println("====Print Rate Category List=====");
        ratingCategoryList.forEach((integer, aLong) -> {
            System.out.println(integer+"="+aLong);
        });
    }

    private static Map<Integer, Long> getListOfCountsOfEmployeesCategorizingByRating(ArrayList<Employee> listOfEmployees, Set<Integer> ratingCategoryEmployeeSet) {
        Map<Integer,Long> ratingCategoryWithCount=new HashMap<>();
        ratingCategoryEmployeeSet.forEach(n->{
            long count=listOfEmployees.stream().map(e->e.getRating()).filter(e->e==n).collect(Collectors.counting());
            ratingCategoryWithCount.put(n,count);
        });
        return ratingCategoryWithCount;
    }

    private static Set<Integer> getRatingCategories(ArrayList<Employee> listOfEmployees) {
        return listOfEmployees.stream().map(employee -> employee.getRating()).collect(Collectors.toSet());
    }

    private static void categorizingEmployeeByAge(ArrayList<Employee> listOfEmployees) {
        Set<Integer> ageCategoryEmployeeSet = getAgeCategories(listOfEmployees);
        Map<Integer, Long> ageCategoryList = getListOfCountsOfEmployeesCategorizingByAge(listOfEmployees, ageCategoryEmployeeSet);
        printAgeCategoryList(ageCategoryList);
    }

    private static void printAgeCategoryList(Map<Integer, Long> ageCategoryList) {
        System.out.println("====Print Age Category List====");
        ageCategoryList.forEach((integer, aLong) -> {
            System.out.println(integer+"="+aLong);
        });
    }

    private static Set<Integer> getAgeCategories(ArrayList<Employee> listOfEmployees) {
        return listOfEmployees.stream().map(employee -> employee.getAge()).collect(Collectors.toSet());
    }

    private static ArrayList<Employee> getAllEmployeeList() {
        EmployeeGenerator employeeGenerator=new EmployeeGenerator();
        return employeeGenerator.getAllList();
    }

    private static Map<Integer, Long> getListOfCountsOfEmployeesCategorizingByAge(ArrayList<Employee> listOfEmployees, Set<Integer> ageCategoryEmployeeSet) {
        Map<Integer,Long> ageCategoryWithCount=new HashMap<>();
        ageCategoryEmployeeSet.forEach(n->{
            long count=listOfEmployees.stream().map(e->e.getAge()).filter(e->e==n).collect(Collectors.counting());
            ageCategoryWithCount.put(n,count);
        });
       return ageCategoryWithCount;
    }
}
