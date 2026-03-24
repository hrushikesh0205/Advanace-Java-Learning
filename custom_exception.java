class myownexception extends Exception
{
    public myownexception(String string)
    {
        super(string);
    }
}
public class custom_exception {

public static void main(String[] args) {
    

int i=20;
int j=0;

try
{
   j=18%i;
   if(j==0)
   {
      throw new myownexception("Don't print 0");
   }
}

catch(ArithmeticException e)
{
    j=18/i;
    System.out.println("Default output"+e);
}
catch(Exception e)
{
    System.out.println("Something wrong"+e);
} 
System.out.println(j);
System.out.println("Bye");   
}
}