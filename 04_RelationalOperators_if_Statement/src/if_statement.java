public class if_statement
{
    public static void main ( String [] args )
    {
        String dogName = "Fari";
        boolean isAlive = true;

        if ( isAlive == true )
        {
            System.out.println( "woof woof!" );
        }
        else
        {
            System.out.println( "R.I.P" );
        }

        String owner = "José";
        double money = 32000;

        if ( money >= 500 )
        {
            System.out.println( "You should buy " + dogName + "a ball" );
        }
        else
        {
            System.out.println( "Go to the bank and ask for a loan" );
        }
    }
}
