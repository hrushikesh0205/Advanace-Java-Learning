public class exception_handling_types {
    
    public static void main(String[] args) {
        
        int i=0;
        int j=0;

        int nums[]= new int[5];

        try
        {
            System.out.println(nums[5]);
            j=18%i;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Check the array size");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }
    }
}
