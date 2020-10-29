package Oop;

public class ExecutionOfEmployee {
    public static void main(String[] args) {
        //Employees shadman = new Employees();
        //shadman.nameOfEmployee("Shadman");
        //shadman.idOfEmployee(456);
        Employees employees = new Employees();
        employees.setNameOfEmployee("shadman");

        employees.setIdOfEmployee(102);

        System.out.println(employees.getNameOfEmployee());
        System.out.println(employees.getIdOfEmployee());


    }
}
