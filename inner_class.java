class A
{
    int name;

    public void show()
    {
        System.out.println("in show method");
    }

    static class B
    {
        public void show1()
        {
            System.out.println("in show 1");
        }
    }
}

public class inner_class {
    public static void main(String[] args) {
  
    A obj= new A();
    obj.show();

    A.B obj1= new A.B();
    obj1.show1();

    }
    
}
