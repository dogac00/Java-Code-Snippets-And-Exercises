public class App
{
    public static void main(String[] args)
    {
        
    }
    
    private static void foo(double... a, int... b) // Error 
    {
        
    }

    private static void bar(short... a, int b) // Error 
    {

    }
    
    private static void zar(int... ... val) // Error
    {

    }
    
    private static void tar(int[]... val) // Valid
    {
        
    }
}
