@FunctionalInterface           // lambda interface work only with the functional interface
interface A
{
    void show(int i);

}
public class lambda_expression {
    
    public static void main(String[] args) {
        
        A obj1=  i-> System.out.println("Lambda Expression"+i);
        obj1.show(5);
    }
}
