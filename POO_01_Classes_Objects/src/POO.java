public class POO
{
    public static void main ( String [] args )
    {
        // Classes = Blue print of something (Objects)
        Ball myBall = new Ball();
        Ball juanito = new Ball();

        myBall.bounce();
        myBall.inflate();
        myBall.deflate();

        myBall.type = "Soccer";
        myBall.brand = "Piraña";
        myBall.color = "Yellow";
        myBall.bounceRate = 2;

        System.out.println( "Ball's type: " + myBall.type );
        System.out.println( "Ball's brand: " + myBall.brand );
        System.out.println( "Ball's color: " + myBall.color );
        System.out.println( "Ball's bounce rate: " + myBall.bounceRate );
    }
}
