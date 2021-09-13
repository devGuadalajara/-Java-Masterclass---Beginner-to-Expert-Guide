public class for_loops
{
    public static void main ( String [] args )
    {
        //Example for loop
        for(int iterator= 1; iterator<=20; iterator++)
        {
            if( iterator%2 == 0 )
                System.out.println( "Iteration: " + iterator );
        }

        //Example while loop
        int age = 0;
        boolean isAlive = true;

        while ( age <= 70 )
        {
            System.out.println( "IsAlive at age: " + age + " (" + isAlive + ")" );
            age++;
        }

    }
}
