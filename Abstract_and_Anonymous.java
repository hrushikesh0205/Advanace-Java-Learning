abstract class A
{
    public abstract void show();
}
public class Abstract_and_Anonymous {
    
    public static void main(String[] args) {
        
        A obj= new A() {
            
            public  void show()
            {
                System.out.println("show method");
            }
        };

        obj.show();
    }
}
