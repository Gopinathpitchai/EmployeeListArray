package employee;

import java.util.*;

public class ListSample {
    public static void main(String [] args){
        List<Employee>employeeList=new ArrayList<>(50);

        Employee employee_1 = new Employee(1,"Gopinath",2000);
        Employee employee_2 = new Employee(2,"Siva",2000);
        Employee employee_3 = new Employee(3,"Nagaraj",2000);
        Employee employee_4 = new Employee(4,"Navya",2000);
        Employee employee_5 = new Employee(5,"Deepa",2000);
        Employee employee_6 = new Employee(6,"Nylah",2000);
        Employee employee_7 = new Employee(7,"Govindan",2000);

        List<Employee>employeeList2=new ArrayList<>();

        Employee employee1= new Employee(1,"Gopinath",2000);
        Employee employee2 = new Employee(2,"Siva",2000);
        Employee employee3 = new Employee(3,"Nagaraj",2000);
        Employee employee4 = new Employee(4,"Navya",2000);
        Employee employee5 = new Employee(5,"Mani",2000);
        Employee employee6 = new Employee(6,"Nylah",2000);




        employeeList.add(employee_1);
        employeeList.add(employee_2);
        employeeList.add(employee_3);
        employeeList.add(employee_4);
        employeeList.add(employee_5);
        employeeList.add(employee_6);

        // For Compare Two ArrayLists
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);


        //add(Index) This Insert at First Position
        employeeList.add(0,employee_7);

        //Retrieve Element by Index
        System.out.println("Retrieve Element by Index"+employeeList.get(5));

        //Update ArrayList Element
        employeeList.set(2,new Employee(8,"Saratha",2000));

        //Remove Third Element
        employeeList.remove(2);

        //Search Element in ArrayList
        Scanner search = new Scanner(System.in);

        System.out.print("Enter your name:");
        String searchName =search.nextLine();


        for (Employee emp : employeeList) {
            if (emp.getEmployeeName().equalsIgnoreCase(searchName)) {
                System.out.println("Employee found: " + emp);
                break;
            }
        }

        //Sort ArrayList
//        System.out.println("List before sort: "+employeeList);
//        Collections.sort(employeeList);

        //Copy ArrayList
        List<Employee> copiedList=new ArrayList<>(employeeList);
        System.out.println("Copied List: " + copiedList);


        //shuffle arraylist

        System.out.println("Original list: " + employeeList);
        Collections.shuffle(employeeList);
        System.out.println("After shuffle: "+employeeList);

        //Reverse arraylist
        System.out.println("Original ArrayList: " + employeeList);
        Collections.reverse(employeeList);
        System.out.println("ArrayList Reverse: " + employeeList);

        //Extract Sublist from ArrayList
        List<Employee> extract = employeeList.subList(0,5);
        System.out.println("List of first five elements "+extract);

        //Compare Two ArrayLists
        System.out.println("employeeList.equals(employeeList2): "+employeeList.equals(employeeList2));

        //Swap ArrayList Elements

        System.out.println("Before Swaping:"+employeeList);
        Collections.swap(employeeList,2,1);
        System.out.println("After Swaping:"+employeeList);

        //Join Two ArrayLists
        employeeList.addAll(employeeList2);
        System.out.println("Join Two arraylist:"+employee1);

        //Clone ArrayList
        ArrayList<Employee> cloneList = new ArrayList<>(employeeList);
        System.out.println("Clone Array :"+cloneList);

        //Clear ArrayList
        employeeList.clear();
        System.out.println("After Clearing ArrayList:"+employeeList);

        //Check if ArrayList is Empty
        System.out.println("Is the employee ArrayList is Empty :"+ employeeList.isEmpty());

        //Trim ArrayList Capacity
        System.out.println("capacity:"+employeeList.toArray().length);

        // Replace Second Element
        employeeList.set(1, new Employee(9, "Kokila", 2000));

        //Print Elements by Position
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println("Element at Index  "+i +": "+employeeList.get(i));

        }


//        System.out.println("Size of the list...." + employeeList.size());
//
//
////        System.out.println(employeeList.get(5));
//
//
//
//
//        for (Employee employee:employeeList){
//            System.out.println(employee);
//        }


    }
}
