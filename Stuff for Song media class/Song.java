
public class Song
{
   private int rating;
   private String title;
   private double price;
   public Song() {
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
   public double getPrice(){
       return price;
    }
   public void setPrice(double p){
       price = p;
    }
   public Song(String title, int rating){
       this.title = title;
       this.rating = rating;
    }
   public Song(String title, double price, int rating){
       this.title = title;
       this.price = price;
       this.rating = rating;
    }
}
