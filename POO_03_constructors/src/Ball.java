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
    private String brand;
    private String color;
    private String type;
    private int bounceRate;
    private int capacity;


    //Constructors
    //Allow us to construct proper objects - Initialize state of properties
    public Ball( String brand, String color, String type, int bounceRate, int capacity )
    {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.bounceRate = bounceRate;
        this.capacity = capacity;
    }


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


    //Getters and Setters
    //Brand
    public String getBrand()
    {
        return brand;
    }

    public void setBrand( String brand )
    {
        this.brand = brand;
    }

    //Color
    public String getColor()
    {
        return color;
    }

    public void setColor( String color )
    {
        this.color = color;
    }

    //Type
    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    //BounceRate
    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate( int bounceRate )
    {
        this.bounceRate = bounceRate;
    }

    //Capacity
    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity( int capacity )
    {
        this.capacity = capacity;
    }

}
