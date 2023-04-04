import static java.lang.System.*;

public class attendence {
    public static void main(String[] args){
        stud m = new stud();
        m.display();
    }
}

class stud{
    int id;
    String name;
    void display()
    {
        out.println(id+""+ name);
    }
}
