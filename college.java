public class college {
    int id=12;
    String name="rudra";
    void event()
    {
        System.out.println("To be declared later");
    }
    void attend(int i, String j)
    {
        id=i;
        name=j;
        System.out.println("Name "+name+" Student ID "+id);

    }
    public static void main(String[]args)
    {
        college cg=new college();
    }
}
