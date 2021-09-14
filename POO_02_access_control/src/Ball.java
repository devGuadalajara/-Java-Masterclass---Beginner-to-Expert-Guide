//Class ball (Blue print of a ball)
public class Ball
{
    /*
        control acess
        - Public - Anyone can access and modify... its methods / properties
        - Private - Only access within the class
        - Protected -
     */



    //Properties or instance variables
    public String brand;
    public String color;
    public String type;
    public int bounceRate;

    private int capacity;


    //Methods (Behaviour)
    public void bounce()
    {
        System.out.println( "Bouncing!" );
    }

    public void deflate()
    {
        System.out.println( "Deflating" );
    }

    public void inflate()
    {
        System.out.println( "Inflating" );
    }
}
