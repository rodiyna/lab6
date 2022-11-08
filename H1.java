import java.util.Scanner;

/**
 * Created by students on 07/11/22.
 */
public class H1 {

    public static void main(String[] args) {
        System.out.print("enter a word : ");
        Scanner input =new Scanner(System.in);
        String text=input.next();
        for(int n=1;n<=text.length();n++)
        {
            System.out.print(text.charAt(text.length()-n));
        }
    }
}
