
/**
 * Write a description of class Books here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title;
    private int rating;
    private double price;
   public Book(){
        title = "";
        rating = 0;
    }
   public void setTitle(String t){
        title = t;
    }
   public String getTitle(){    
        return title;
     } 
   public int getRating(){
       return rating;
    }
   public void setRating(int r){
       rating = r;
    }
}
