import pacProject1.Book;
import pacProject1.Author;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Author nikolayGogol = new Author("Николай", "Гоголь");
        Book bookFromGogol1 = new Book("Мертвые души", nikolayGogol, 1842);
        Book bookFromGogol2 = new Book("Вий", nikolayGogol, 1835);

        Author borisAkunin = new Author( "Борис", "Акунин");
        Book bookFromAkunin1 = new Book("Азазель",borisAkunin,1998);
        Book bookFromAkunin2 = new Book("Левиафан", borisAkunin,1998);

        System.out.println(bookFromAkunin2.getYear());
        bookFromAkunin2.setYear(2000);
        System.out.println(bookFromAkunin2.getYear());

        System.out.println(bookFromAkunin2.getAuthor()); //выводит ссылку




    }
}