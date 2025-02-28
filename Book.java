public class Book {
    String title;
    String author;
    int year_of_publication;
  
    public Book(String title, String author, int year_of_publication ) {
        this.title = title;
        this.author = author;
        this.year_of_publication = year_of_publication;
    }

    public void displayDetails() {
       System.out.println(this.title);
       System.out.println(this.author);
       System.out.println(this.year_of_publication);
       System.out.println();
    }
}
    
public class Function { 
    public static void main(String[]args) {
       Book book_one = new Book("The Magic of the lost Story", "Sudha Murthy", 2022);
       Book book_two = new Book("Three thousand stiches", "Sudha Murthy", 2021);
       System.out.println("Book one details: ");
       book_one.displayDetails();
       System.out.println("Book two details: ");
       book_two.displayDetails();
     
    }
}


