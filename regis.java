import java.util.Scanner;

import static java.lang.System.exit;


class student{
    String fname,lname,program;
    int age,marks,lmarks;

    void registeration(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        fname = sc.nextLine();
        System.out.println("Enter lname");
        lname = sc.nextLine();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter marks");
        marks = sc.nextInt();
        System.out.println("Enter lmarks");
        lmarks = sc.nextInt();
    }

    void registeration(String name, String namee,int a,int b,int c){
        this.fname = name;
        this.lname = namee;
        this.age = a;
        this.marks = b;
        this.lmarks = c;
    }

    void display(){
        System.out.println("The name is:"+ fname);
        System.out.println("The Surname is:"+ lname);
        System.out.println("The age is:"+ age);
        System.out.println("The School Marks is:"+ marks);
        System.out.println("The Higher marks is:"+lmarks);
        System.out.println("Program is :" + program);
    }
}

class program extends student{
    void check(){
        if(lmarks>90)
        {
            program="MBBS";
        } else if (lmarks<=90 && lmarks>80)
        {
            program="BDS";
        } else if (lmarks<=80 && lmarks>70)
        {
            program="BHMS";
        } else if (lmarks<=70 && lmarks>60)
        {
            program="BAMS";
        }else
        {
            program="REPEATER";
        }
    }
}

class conference extends program{
    String reg = "n";
    String papertitle;
    void reg(){
        Scanner n = new Scanner(System.in);
        System.out.println("Register? Y/N");
        reg=n.nextLine();
        if(reg.equalsIgnoreCase("y"))
        {
            System.out.println("Enter papertitle:");
            papertitle = n.nextLine();
        } else if (reg.equalsIgnoreCase("n"))
        {
            System.out.println("GG see u Again");
            exit(0);
        }else
        {
            System.out.println("Invalid Input");
        }
    }
    void disp(){
        System.out.println("The paper title is :"+papertitle);
    }
}

public class regis {
    public static void main(String[] args){
        conference s1 = new conference();
        s1.registeration();
        s1.check();
        s1.display();
        s1.reg();
        s1.disp();

    }
}