import java.util.Scanner;

public class electricity
{
    public static void main(String[] args)
    {
        /* for input lavde */
        System.out.println("Enter the Bijli unit");
        Scanner s = new Scanner(System.in);
        int bijli = s.nextInt();

        if(bijli<50)
        {
            double bill = (int) (bijli * 0.50 );
             bill =  bill + ((bill * 20) / 100);
            System.out.println("Your Bijli ka bill to be paid With Gst is " + bill);
        } else if (bijli>50 && bijli<150)
        {
            double bill = (int) (bijli * 0.75 );
            bill =  bill + ((bill * 20) / 100);
            System.out.println("Your Bijli ka bill to be paid With Gst is " + bill);

        } else if (bijli>=150 && bijli<250)
        {
            double bill =  (int) (bijli * 1.20);
            bill =  bill + ((bill * 20) / 100);
            System.out.println("Your Bijli ka bill to be paid With Gst is " + bill);

        } else if (bijli>=250)
        {
            double bill = (int) (bijli * 1.50 );
            bill =  bill + ((bill * 20) / 100);
            System.out.println("Your Bijli ka bill to be paid With Gst is " + bill);
        }

    }
}
