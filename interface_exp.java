interface A
{
    int age=21;
    String name="Hrushikesh";    // in interface varibale is default final

    public void show();
    public void show1();
}

class B implements A
{
   
    public void show()
    {
        System.out.println("in show  method");
    }

    public void show1()
    {
        System.out.println("In show 1 method");
    }

}
public class interface_exp{

    public static void main(String[] args) {
        
    
    A obj;
    obj= new B();
    obj.show();
    obj.show1();
    
}
}
