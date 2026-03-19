class A
{
    public void show()
    {
        System.out.println("ld show method");
    }
}
public class Anonymous_class {
    public static void main(String[] args) {

        A obj= new A()
        {
            public void show()
            {
                System.out.println("Updated show method");
            }
        };
        obj.show();
        
    }
    
}
