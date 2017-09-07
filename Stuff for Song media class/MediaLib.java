
public class MediaLib
{
    public static void main(){
        System.out.println("Welcome to your Media Library");
        Song song1 = new Song();
        song1.setTitle("Johnny B. Goode");  
        System.out.println(song1.getTitle());
        song1.setRating(5);
        System.out.println(song1.getRating());
        song1.setPrice(10.0);
        System.out.println("$" + song1.getPrice());
        /*
        Movie movie1 = new Movie();
        movie1.setTitle("Sharks and Jaws");
        System.out.println(movie1.getTitle());
        Book book1 = new Book();
        book1.setTitle("Sos and the tales of sauce");
        System.out.println(book1.getTitle()); */
    }
}
