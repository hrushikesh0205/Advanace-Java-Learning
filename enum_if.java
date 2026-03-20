enum status 
{
    pending,failed, successful;
}
public class enum_if {

    public static void main(String[] args) {
        
        status s= status.pending;

        if(s==status.pending)
        {
            System.out.println("Wait for miniute");
        }
        else if(s==status.failed)
        {
            System.out.println("Try again!!");
        }
        else
        {
            System.out.println("Successful!!");
        }

    }
    
}
