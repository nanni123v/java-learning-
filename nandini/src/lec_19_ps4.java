import java.util.Scanner;
public class lec_19_ps4 {
    public static void main(String[] args) {
        //quest2
      /*  byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in physics");
        m1=sc.nextByte();
        System.out.println("enter your marks in chemistry");
        m2 =sc.nextByte();
        System.out.println("enter your marks in maths");
        m3 =sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your overall percentage: "+avg);
        if(avg>=40&& m1>=33&& m2>=33&& m3>=33) {
            System.out.println("congratulation! you have been promoted");
        }
        else{
            System.out.println("sorry you have not been promoted");
        }*/

        //ques3
       Scanner sc= new Scanner(System.in);
        System.out.println("enter your income in lakh per annum");
        float tax = 0;
        float income =sc.nextFloat();
        if(income<=2.5f) {
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5f) {
            tax = tax + 0.05f*(income-2.5f);
        }
        else if(income>5f && income<=10f) {
            tax = tax+0.05f*(5f-2.5f);
            tax = tax +0.2f*(income-5f);
        }
        else if(income>10f){
            tax = tax+0.05f*(5f-2.5f);
            tax = tax +0.2f*(10f-5f);
            tax = tax +0.3f*(income-10f);
        }
        System.out.println("your amount of tax is:"+tax);

        //ques4
      /*  Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thursday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("saturday");
        }*/
        //ques 6
       /* Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")) {
            System.out.println("this is called organizational website");
        }
        else if(website.endsWith(".com")) {
            System.out.println("this is called commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("this is called indian website");
        } */

    }
}
