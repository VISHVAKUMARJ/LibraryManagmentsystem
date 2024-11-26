//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LIBRARY library = new LIBRARY();
        //add books
        BOOK book1 = new BOOK(1, "money", "adam");
        BOOK book2 = new BOOK(2, "love", "eve");
        BOOK book3 = new BOOK(3, "fame", "push");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        MEMBER member1 = new MEMBER("vishva", 52169097, 2);
        MEMBER member2 = new MEMBER("kamal", 521620003, 2);

        System.out.println("Display Books :");
        library.disp();

        System.out.println("Lend Books :");
        library.lendbooks(book1,member1);
        library.disp();
        System.out.println("Return Books :");
        library.returnbooks(book1,member1);
        library.disp();
    }
}