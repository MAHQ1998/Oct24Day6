package Oop;

public class ExecutionOfEmployee {
    public static void main(String[] args) {

        Employees employees = new Employees();

        employees.setNameOfEmployee("shadman");
        employees.setIdOfEmployee(102);

        System.out.println(employees.getNameOfEmployee());
        System.out.println(employees.getIdOfEmployee());


    }
}
