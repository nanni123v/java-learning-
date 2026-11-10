

public class lec15ps3 {
    public static void main(String[] args) {
        //problem 1 convert string to lower case
        String name = "Nandini Kumari";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2 replace spaces with underscore
        String text = "yes babe no";
        text = text.replace( " ","_" );
        System.out.println(text);

        //problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","cutiee");
        System.out.println(letter);

        //problem 4 to detect double and triple space
        String relax = " This string contain   double and triple space";
        System.out.println(relax.indexOf("  "));
        System.out.println(relax.indexOf("   "));

        //problem 5 convert into format letter by using escape sequence
        String myletter = "Dear Harry,\n\tThis Java Course is nice.\nThanks";
        System.out.println(myletter);


    }
}
