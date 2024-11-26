import java.util.ArrayList;
import java.util.List;
public class MEMBER {
    private String name;
    private int memberId;
    private List<BOOK> listofbooks;
    private int maxBookAllowed;

    public MEMBER(String name, int memberId,int maxBookAllowed){
        this.name = name;
        this.memberId = memberId;
        this.maxBookAllowed = maxBookAllowed;
        this.listofbooks = new ArrayList<>();
    }
    public List<BOOK> getBorrowedbooks(){
       return listofbooks;
    }
    public void borrowedBook(BOOK book){
        if(listofbooks.size() < maxBookAllowed && (!book.isBorrowed())){
            book.BorrowBook();
            listofbooks.add(book);
        }else{
            System.out.println("Max no of book exceeded");
        }
    }
    public void returnBook(BOOK book){
        if(listofbooks.contains(book)){
            book.returnBook();
            listofbooks.remove(book);
        }else{
            System.out.println("Book not borrowed by this member");
        }
    }
}
