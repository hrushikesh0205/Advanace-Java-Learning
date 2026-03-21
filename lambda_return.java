interface A
{
    int show(int a,int b);
}
public class lambda_return {

   public static void main(String[] args) {
    
    A obj= (a,b)->a+b;
    
    int result= obj.show(20, 30);
    System.out.println(result);
    

   }
}
