package employee;

import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String [] args){
        List<Employee>employeeList=new ArrayList<>();

        Employee employee_1 = new Employee(1,"Gopinath",2000);
        Employee employee_2 = new Employee(2,"Siva",2000);
        Employee employee_3 = new Employee(3,"Nagaraj",2000);
        Employee employee_4 = new Employee(4,"Navya",2000);
        Employee employee_5 = new Employee(5,"Deepa",2000);
        Employee employee_6 = new Employee(6,"Nylah",2000);
        Employee employee_7 = new Employee(7,"Govindan",2000);




        employeeList.add(employee_1);
        employeeList.add(employee_2);
        employeeList.add(employee_3);
        employeeList.add(employee_4);
        employeeList.add(employee_5);
        employeeList.add(employee_6);

        //add(Index) This Insert at First Position
        employeeList.add(0,employee_7);

        //Retrieve Element by Index
        System.out.println("Retrieve Element by Index"+employeeList.get(5));

        //Update ArrayList Element
        employeeList.set(2,new Employee(8,"Saratha",2000));

//        //Remove Third Element
//        employeeList.remove(2);




        System.out.println("Size of the list...." + employeeList.size());


//        System.out.println(employeeList.get(5));




        for (Employee employee:employeeList){
            System.out.println(employee);
        }


    }
}
