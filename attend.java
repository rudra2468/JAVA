import static java.lang.System.*;

public class attend {
    public static void main(String [] args){
    stude Y;
        Y = new stude(2022,"RUDRA");
        stude X;
        X = new stude(2023,"VANSH");
        stude Z;
        Z = new stude(2024,"SAIKRISHNA");

        X.display();
    Y.display();
    Z.display();
    }
}

 class stude{
    int id;
    String name;
            stude(int a , String b){
                id = a;
                name = b;
            }
    void display(){
        out.println(id+": wale Launde ka NAAM hai :"+name);}
}