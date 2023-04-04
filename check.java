import java.util.Scanner;


public class check
{
    public static void main(String [] args)
    {
        System.out.println("Slam the Keyboard");
        Scanner s = new Scanner(System.in);
        char yo = s.next().charAt(0);
        if(Character.isAlphabetic(yo))
        {
            System.out.println("ALPHABET");
        } else if (yo >= '0' && yo<='9')
        {
            System.out.println("Digit");
        }else
        {
            System.out.println("Special Character");
        }
    }
}

