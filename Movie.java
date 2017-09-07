

public class Movie
{
    private int rating;
    private String title;
   public Movie(){
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
