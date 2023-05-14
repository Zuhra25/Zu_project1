import pacProject1.Book;
import pacProject1.Author;


public class Main {
    public static void main(String[] args) {

        Author nikolayGogol = new Author("Николай", "Гоголь");
        Book deadSouls = new Book("Мертвые души", nikolayGogol, 1842);

        Author borisAkunin = new Author( "Борис", "Акунин");
        Book leviafan = new Book("Левиафан", borisAkunin,1998);

        System.out.println(deadSouls);
        System.out.println(leviafan);

        //сеттер на год выпуска
        System.out.printf("Левиафан (год выпуска) - %s%n", leviafan.getYear());
        //leviafan.setYear(2000); // задать вручную
        leviafan.setYear(leviafan.getYear()+2);
        System.out.printf("Левиафан (год выпуска измененный) - %s%n%n",leviafan.getYear());

        //вывод инфы о книге c новым годом издания
        System.out.println(leviafan);
    }
}