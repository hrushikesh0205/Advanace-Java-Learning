enum status
{
    Running, Failed, Pending, Success
}

public class enum_exp {
    public static void main(String[] args) {
        
        status[] ss = status.values();

        for(status s : ss)
        {
            System.out.println(s + " : " + s.ordinal());
        }
    }
}