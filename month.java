import java.util.Objects;
import java.util.Scanner;

public class month {
    public static void main(String[] args)
    {
        System.out.println("Enter the Mahina");
        System.out.println("Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sept, Oct, Nov, Dec");

        Scanner s = new Scanner(System.in);
        String mahina = s.nextLine();

        if(Objects.equals(mahina, "Jan") || Objects.equals(mahina, "Mar") || Objects.equals(mahina, "May") || Objects.equals(mahina, "Jul") || Objects.equals(mahina, "Aug") || Objects.equals(mahina, "Oct") || Objects.equals(mahina, "Dec"))
        {
            System.out.println("This mahina has 31 days");
        }  else if (Objects.equals(mahina, "Feb") )
        {
            System.out.println("The mahina has 28 days");
        }else
        {
            System.out.println("The mahina has 30 days");
        }
    }
}
