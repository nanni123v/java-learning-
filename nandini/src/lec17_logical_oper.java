import java.sql.SQLOutput;

public class lec17_logical_oper {
    public static void main(String[] args) {
        System.out.println("FOR LOGICAL AND");
        boolean a = true;
        boolean b = true;
        if(a && b) {
            System.out.println("y");
        }
        else{
            System.out.println("n");
        }

        System.out.println("FOR LOGICAL OR");
        if(a || b) {
            System.out.println("y");
        }
        else{
            System.out.println("n");
        }
        System.out.println("FOR LOGICAL NOT");
        System.out.println("Not(a) is");
        System.out.println(!a);
        System.out.println("Not(b) is");
        System.out.println(!b);

    }
}
