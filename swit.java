import java.util.Scanner;

public class swit
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Grades");
        Scanner y = new Scanner(System.in);
        int grade = y.nextInt();
        switch (grade / 10) {
            case 10 -> System.out.println("Out Standing!");
            case 9 -> System.out.println("A SAHI HAI ");
            case 8 -> System.out.println("B THEEK HAI");
            case 7 -> System.out.println("C LES GO PASS");
            case 6 -> System.out.println("D AGLE SEMSETER TOP KARENGE");
            default -> System.out.println("F NIKAL LA*DE");
        }


    }
}
