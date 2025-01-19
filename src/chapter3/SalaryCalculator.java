package chapter3;

import java.util.Scanner;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {
    public static void main(String arg[]) {

        //Intialize salary, bonus, and quota variables.
        int salary = 1000 , bonus = 250 , quota = 10;

        //Get the number of sales that seller do
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //calculate the bonus if sales exceeded the quota
        if(sales > quota){
            salary += bonus;
        }

        //print the total salary
        System.out.println("the employee's salary is " + salary + "$");

    }
}
