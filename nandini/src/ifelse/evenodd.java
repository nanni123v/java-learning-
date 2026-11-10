package ifelse;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age= sc.nextInt();
        if(age%2==0){
        System.out.println("age is even");}
        else
        System.out.println("age is odd");
    }
}
