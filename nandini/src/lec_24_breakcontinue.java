public class lec_24_breakcontinue {
    public static void main(String[] args) {
        //break and continue
    /*    for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("loop is end");
                break;
            }
        }*/

        // for while
       /* int i = 0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("loop is end");
                break;
            }
            i++;

        }*/

        // for dowhile
     /*   int i=1;
        do {
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2){
                System.out.println("loop is end");
                break;
            }
            i++;}
            while (i <= 5) ;*/

        //continue
        for(int i=1; i<50; i++){
            if (i == 2) {
                System.out.println("loop is end");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }




    }}
