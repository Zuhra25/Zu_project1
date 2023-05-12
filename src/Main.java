import pacProject1.Book;
import pacProject1.Author;

public class Main {
    public static void main(String[] args) {

        Book harryPotter = new Book("Harry Potter", "Joanne Rowling", 2000);
        System.out.println("harryPotter.name = " + harryPotter.getName());

        Author joanneRowling = new Author("Joanne", "Rowling");
        System.out.println("joanneRowling.name = " + joanneRowling.getName());
    }
}