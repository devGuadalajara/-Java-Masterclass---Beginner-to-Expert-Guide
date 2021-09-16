public class POO
{
    public static void main ( String [] args )
    {
        // Classes = Blue print of something (Objects)
        Ball myBall = new Ball( "Piraña", "Yellow", "Basketball", 10, 100 );
        myBall.bounce();
        myBall.inflate();
        myBall.deflate();
        myBall.getAllProperties();
        System.out.println( "----------------------" );

        Ball myFavouriteBall = new Ball();
        myFavouriteBall.setBrand( "Amazon basics" );
        myFavouriteBall.setType( "Soccer" );
        myFavouriteBall.setColor( "Green" );
        myFavouriteBall.getAllProperties();
        System.out.println( "----------------------" );

        Ball miriamBall = new Ball( "Generic",  "Baseball" );
        miriamBall.getAllProperties();
        miriamBall.setColor( "White and red strips" );
        miriamBall.setCapacity( 75 );
        miriamBall.setBounceRate( 25 );

        System.out.println( "----------------------" );
        miriamBall.getAllProperties();
    }
}