public class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void bookDetails(){
        System.out.println("Book title : " + title);
        System.out.println("Book author : " + author);
        System.out.println("Book price : " + price);
    }


}
