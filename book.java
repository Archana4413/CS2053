public class Book
{
 String title;
 String author;
 int year;

 public Book(String title, String author, int year) {
 this.title = title;
 this.author = author;
 this.year = year;
 }

 public void displayDetails() {
 System.out.println("Book Title: " + this.title);
 System.out.println("Author: " + this.author);
 System.out.println("Year Published: " + this.year);
 }

 public static void main(String[] args) {
 Book myBook = new Book("1984", "George Orwell", 1949);
     myBook.displayDetails();
    }
}
