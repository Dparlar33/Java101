package OOP;

import java.util.Scanner;

class Employee {
    String name;
    int salary,workHours,startYear;
    Employee(int salary, int workHours ,String name,int startYear){
        this.salary = salary;
        this.workHours = workHours;
        this.name = name;
        this.startYear = startYear;
    }
    int Tax(){
        int Tax = 0;
        if(salary > 1000){
            Tax =  (salary*3)/100;
        }
        return Tax;
    }
    int Bonus(){
        int Extra = 0;
        if(workHours > 40){
            Extra = (workHours-40)*30;
        }
        return Extra;
    }
    int raiseSalary(){
        int SalaryRaise=0;
        if(2021 - startYear < 10){
            SalaryRaise =  (salary*5)/100;
        }else if(2021 - startYear > 9 && 2021-startYear <20){
            SalaryRaise =  (salary*10)/100;
        }else{
            SalaryRaise = (salary*15)/100;
        }
        return SalaryRaise;
    }
    int TotalSalary(){
        int totalSalary;
        totalSalary = salary + raiseSalary();
        return totalSalary;
    }
   @Override
   public String toString() {
        System.out.println("Tax: " + Tax());
        System.out.println("Extra: " + Bonus());
        System.out.println("Salary raise: " + raiseSalary());
        System.out.println("Salary with the Tax and Bonus: " + (salary - Tax() +Bonus()));
        System.out.println("Total Salary: " + TotalSalary());
       
       return super.toString();
   }
}
public class CalculateSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name = input.nextLine();

        System.out.println("Enter employee salary: ");     
        int salary = input.nextInt();

        System.out.println("Enter employee work hours: ");
        int workHours = input.nextInt();

        System.out.println("Enter employee starting year: ");
        int startYear = input.nextInt();

        Employee employee = new Employee(salary, workHours, name,startYear);
        employee.toString();
    }
}
