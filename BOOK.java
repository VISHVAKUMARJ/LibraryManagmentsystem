
public class BOOK {
    private int book_id;
    private String book_name;
    private String author;
    private boolean isBorrowed;

    public BOOK(int book_id,String book_name, String author){
        this.book_id = book_id;
        this.book_name = book_name;
        this.author = author;
        this.isBorrowed = false;
    }
    public int getBook_id(){
        return this.book_id;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getBook_name(){
        return this.book_name;
    }
    public boolean isBorrowed(){
        return isBorrowed;
    }
    public void BorrowBook(){
        if(isBorrowed){
            System.out.println("Already Borrowed");
        }else{
            isBorrowed = true;
            System.out.println("Borrowed successfully");
        }
    }
    public void returnBook(){
        if(isBorrowed){
            isBorrowed = false;
        }else{
            System.out.println("Book returned successfully");
        }
    }
}
