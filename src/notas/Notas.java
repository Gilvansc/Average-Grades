package notas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notas {
    private static double total;
    private static Scanner input = new Scanner(System.in);
    private static List grades=new ArrayList();
    public static void main(String[] args) {
        do {
            System.out.print("add a grade: ");
            try {
                double grade=input.nextDouble();
                addGrade(grade);
            } catch (Exception e) {
                System.out.println("input a valid grade");
                input.next();
            }
            System.out.print("one more grade? (Y/N)");
        }while(input.next().contains("y"));
    result();
    }

    private static void addGrade(double grade){
        if (isValidGrade(grade)) {
            grades.add(grade);
            total += grade;
        }
    }
    private static boolean isValidGrade (double grade) {
        return grade<=10 && grade>=0;
    }
    private static void result(){
//        System.out.println("grades quantity: "+grades.size());
//        System.out.println("grades: "+grades);
        System.out.printf("grades media: %.2f || Result: ",total/grades.size());
        if (total/grades.size()>=6.0)
            System.out.println("approved!!!");
        else System.out.println("reproved!!!");
    }
}
