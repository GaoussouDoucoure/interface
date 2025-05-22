interface A
{
    //	public abstract void show();
    //	public abstract void config();

    /*
    By default, every method created in an interface is of "public abstract" and there is no need to mention it
    By default, every variable created in an interface is of "final static", they can't be changed and don't need an object to call them
     */

    int age=44;            // final and static
    String area="Mumbai"; // final and static

    void show();    // true form of this is line 3 but no need to mention public abstract in interface
    void config();  // true form of this is line 4 but no need to mention public abstract in interface
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in cofing");
    }
}

public class Main {
    public static void main(String[] args) {

        A obj;
        obj=new B();

        obj.show();
        obj.config();

        //   	A.area="Hyderabad";   this will not work because the variable is in the interface so it is final

        System.out.println(A.area);
        System.out.println(A.age);

    }
}