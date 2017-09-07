public class SongDriver
{
    public static void main(String [] args)
    {
        Song song1 = new Song();
        System.out.println("My favorite song is " + song1.getTitle());
        System.out.println("My favorite song has a price of " + song1.getPrice());
        System.out.print("My next favorite song has a rating of " + song1.getRating());
        Song song2= new Song("Ring of Fire", 1.99, 10);
        System.out.println("My next favorite song is " + song2.getTitle());
        System.out.print("My next favorite song has a price of " + song2.getPrice());
        System.out.print("My next favorite song has a rating of " + song2.getRating());
    }
}
