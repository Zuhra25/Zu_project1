package packProject2;
public class Main {
    public static void main(String[] args) {

        Author nikolayGogol = new Author("Николай", "Гоголь");
        Book deadSouls = new Book("Мертвые души", nikolayGogol, 1842);
        Book viy= new Book ("Вий",nikolayGogol,1835);
        Book bookForCheck = new Book("Проверочная книга", new Author("Александр", "Пушкин"), 1842);
        Book bookForCheck2 = new Book("Вий", nikolayGogol, 1835);

        // toString
        System.out.println(deadSouls);
        System.out.println(viy);

        // equals
        System.out.printf("в какие года написаны книги:%n%s и %s%n",deadSouls.getTitle(), bookForCheck.getTitle());

        if (deadSouls.equals(bookForCheck)) {
            System.out.println("книги написаны в один год");
        } else
        System.out.println("книги написаны в разные года");
        System.out.println();
        //System.out.println(deadSouls.equals(bookForCheck));

        // hashCode
//        System.out.println(bookForCheck2.hashCode());
//        System.out.println(viy.hashCode());

        if (viy.hashCode()==bookForCheck2.hashCode()) {
            System.out.printf("хэшкоды равны %s%n", viy.hashCode());
        } else {
            System.out.printf("хэшкоды НЕ равны %s и %s%n", viy.hashCode(), bookForCheck2.hashCode());
        }

     }
}