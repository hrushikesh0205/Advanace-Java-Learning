//class-class extends
//class-interface  implements 
//interface-interface  extends 

interface A                    
{
    public void show();
    public void show1();
}

interface B
{
    public void run();
}

interface X extends B
{

}

class demo implements A, X
{
   public void show()
   {
    System.out.println("in show method");
   }

   public void show1()
   {
    System.out.println("in show1 method");
   }

   public void run()
   {
     System.out.println("In run method");
   }
}

public class interface_exp2 {
    
    public static void main(String[] args) {
        
        A obj = new demo();
        obj.show();
        obj.show1();

        X obj1 = new demo();
        obj1.run();
    }
}