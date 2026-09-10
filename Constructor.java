//Create a book class with the following attribute:
//book id,title,author
//Create a parameterized constructor to initiliaze these values.
//Create a method displayInformation() to display the book details.
//In main().create two Book objects using the constructorand display their information 
class Book {
    int Bookid;
    String title;
    String author;
    public Book (int Bookid,String title, String author){
        this.Bookid = Bookid;
        this.title = title;
        this.author = author;
    }
    public void displayInformation(){
        System.out.println(Bookid);
        System.out.println(title);
        System.out.println (author);
    }
}
    public class Constructor{
        public static void main (String[] args){
            Book Book1 = new Book(1,"End","Supriya");
            Book1.displayInformation();
        }
    }
