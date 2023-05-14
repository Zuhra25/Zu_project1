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

        // hashCode
        System.out.println(bookForCheck2.hashCode());
        System.out.println(viy.hashCode());



//        Author borisAkunin = new Author( "Борис", "Акунин");
//        Book leviafan = new Book("Левиафан", borisAkunin,1998);

//        System.out.println(deadSouls);
//        System.out.println(leviafan);
//
//        //сеттер на год выпуска
//        System.out.printf("Левиафан (год выпуска) - %s%n", leviafan.getYear());
//        //leviafan.setYear(2000); // задать вручную
//        leviafan.setYear(leviafan.getYear()+2);
//        System.out.printf("Левиафан (год выпуска измененный) - %s%n%n",leviafan.getYear());
//
//        //вывод инфы о книге c новым годом издания
//        System.out.println(leviafan);


        //Реализуйте методы equals и hashCode в классах Author и Book,
        // которые вы создали на прошлом уроке.

    }
}