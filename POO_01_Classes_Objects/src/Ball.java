//Class ball (Blue print of a ball)
public class Ball
{

    //Properties or variables
    public String brand;
    public String color;
    public String type;
    public int bounceRate;

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
