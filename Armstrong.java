import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter No:");
        int fst = a.nextInt();
        int temp = fst;
        int r=0;
        while(fst>0)
        {
            int rem = fst%10;
            r= (r) + (rem * rem * rem);
            fst=fst/10;
        }
        if(temp==r)
        {
            System.out.println("It is an Armstrong No.");
        }
        else {
            System.out.println("Not an Armstrong No.");
        }
    }
}
