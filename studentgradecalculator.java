//student grade calculator

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        System.out.println("WELCOME !");
        int i,countsub;
        float average,percentage,total_marks=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("enter your name : ");
        String Name=sc.next();


        System.out.print("enter number of subjects :");
        countsub=sc.nextInt();

        System.out.print("Each marks obtained from : ");
        int from=sc.nextInt();

        System.out.print("enter marks of  "+countsub+" subjects : ");

        for( i=1; i<=countsub; i++){
            total_marks+=sc.nextInt();
        }

        System.out.println("Name : "+Name);

        System.out.println("Total marks of each subject is :"+ total_marks);

        percentage=((total_marks/(countsub*from))*100);
        System.out.println("Total average percentage : "+percentage);

        if(percentage>=90 && percentage<=100){
            System.out.println("Grade : A+");
        }else if(percentage>=80 && percentage<90){
            System.out.println("Grade : A");
        }else if(percentage>=70 && percentage<80){
            System.out.println("Grade : B");
        }else if(percentage>=60 && percentage<70){
            System.out.println("Grade : C");
        }else if(percentage>=50 && percentage<60){
            System.out.println("Grade : D");
        }

        if(percentage>33){
            System.out.println("Result : passed");
        }else{
            System.out.println("Result : failed");
        }
        System.out.println("Thank you !");
    }
}
