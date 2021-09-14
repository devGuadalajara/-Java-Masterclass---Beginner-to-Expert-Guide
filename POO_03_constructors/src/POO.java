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

        Ball myFavouriteBall = new Ball();
        myFavouriteBall.setBrand( "Amazon basics" );
        myFavouriteBall.setType( "Soccer" );
        myFavouriteBall.setColor( "Green" );
        myFavouriteBall.getAllProperties();
    }
}