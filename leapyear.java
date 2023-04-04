import java.util.Scanner;

public class leapyear
{
    public static void main(String [] args)
    {
        System.out.println("Enter THe SAAL");
        Scanner yo =new Scanner(System.in);
        int saal = yo.nextInt();
        if(saal%4==0)
        {
            System.out.println("Saal LEAP ka SAALA hai");
        }else
        {
            System.out.println("SAAL leap SAALA nhi hai!");
        }
    }
}
