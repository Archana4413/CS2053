class Book 
{
 public String title;
 public String author;
 public int year;

 public Book(String title, String author, int year)
 {
 this.title=title;
 this.author=author;
 this.year=year;
 }
 
 public void display()
 {
  System.out.println("Book Tittle is:" +this.title);
  System.out.println("Author:" +this.Author);
  System.out.println("Year Published:" +this.Year);
 }
}
 
 public class Book
{
 public static void main(String args[])
 {
  Book = new Book("1984", "George Orwell", 1949);
  Book.displayDetails();
  }
}  
 
