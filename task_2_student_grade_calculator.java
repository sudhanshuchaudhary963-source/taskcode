package taskjava;

import java.util.Scanner;

public class task_2_student_grade_calculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("wellcome to grade calculater");
        int[]array=new int[5];
        System.out.print("enter your hindi marks: ");
        array[0]= input.nextInt();
        System.out.print("enter your english marks: ");
        array[1]= input.nextInt();
        System.out.print("enter your physics marks: ");
        array[2]= input.nextInt();
        System.out.print("enter your chemistry marks: ");
        array[3]= input.nextInt();
        System.out.print("enter your maths marks: ");
        array[4]= input.nextInt();
        int sumofnum=sum(array);
        System.out.println("sum of your number is "+sumofnum);
        float avgofnum= avg(array);
        System.out.println("avg marks of your number is "+avgofnum);
        if (avgofnum>=80){
            System.out.println("congratulation you got A grade");
        } else if (avgofnum>=60 && avgofnum<80){
            System.out.println("congratulation you got B grade");

        } else if (avgofnum>40 && avgofnum<60){
            System.out.println("congratulation you got C grade");

        } else if (avgofnum>30 && avgofnum<40){
            System.out.println("congratulation you got D grade");

        }
        else {
            System.out.println("you failed");
        }

    }
    public static int sum(int[] array){
        int sum= 0;
        int i= 0;
        while (i<5){
            sum += array[i];
            i++;
        }
        return  sum;
    }
    public static int avg(int[]array){
        int avg=0;
        int i =0;
        while (i<5){
            avg = sum(array) / 5;
            i++;
        }
        return avg;
    }

}
