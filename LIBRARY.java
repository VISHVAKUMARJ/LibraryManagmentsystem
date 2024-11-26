import java.util.ArrayList;
import java.util.List;
public class LIBRARY {
    private List<BOOK> books;
    private List<MEMBER> members;

    public LIBRARY(){
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    public void addBook(BOOK book){
        books.add(book);
    }
    public void removeBook(BOOK book){
        books.remove(book);
    }
    public void lendbooks(BOOK book, MEMBER member){
        member.borrowedBook(book);
    }
    public void returnbooks(BOOK book, MEMBER member){
        member.returnBook(book);
    }
    public void disp(){
        for(BOOK book : books){
            System.out.println("Tittle " + book.getBook_name()+" " + (book.isBorrowed()? "Borrowed":"Available"));
        }
    }
    public BOOK search(String tittle) {
        for (BOOK book : books) {
            if(book.getBook_name().equals(tittle)){
                return book;
            }
        }
        return null;
    }
}
