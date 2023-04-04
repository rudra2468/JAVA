import java.util.Scanner;

import static java.lang.System.exit;

public class calculator
{
    public static void main(String [] args)
    {
        int fst, snd ;
        System.out.println("Enter 1st Operand");
        Scanner l = new Scanner(System.in);
        fst = l.nextInt();
        System.out.println("Enter 2nd Operand");
        snd = l.nextInt();


        do
        {
            System.out.println("1 for add");
            System.out.println("2 for sub");
            System.out.println("3 for multi");
            System.out.println("4 for div");
            System.out.println("5 for EXIT");
            int choice = l.nextInt();
            switch (choice) {
                case 1 -> {
                    int add = fst + snd;
                    System.out.println(add);
                }
                case 2 -> {
                    int sub = fst - snd;
                    System.out.println(sub);
                }
                case 3 -> {
                    int mult = fst * snd;
                    System.out.println(mult);
                }
                case 4 -> {
                    int div = fst / snd;
                    System.out.println(div);
                }
                case 5 -> {
                    exit(0);
                }
                default -> System.out.println("Invalid Input");
            }
        }while(true);
    }
}
