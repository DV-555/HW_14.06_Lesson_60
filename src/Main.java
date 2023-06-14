import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    //Задача 1
    //Используйте класс Book (книга) из домашнего задания к уроку 43 (см. Book.java).

    //Создайте список книг и отсортируйте книги по названию,
    // (при одинаковых названиях - по автору) при помощи лямбда-функции на месте компаратора.

    List<Book> books = new ArrayList<>();
    books.add(new Book("Пушкин", "Собрание сочинений", 527));
    books.add(new Book("Пушкин", "Руслан и Людмила", 350));
    books.add(new Book("Лермонтов", "Собрание сочинений", 435));
    System.out.println('\n' + " До сортировки ... " + '\n' + '\n' + books);

    //books.sort(new BookTitleAuthorComparator());

    books.sort((Book o1, Book o2) -> {
      String title1 = o1.getTitle();
      String title2 = o2.getTitle();
      return title1.compareTo(title2);
    });
    System.out.println(" После сортировки по названию ...  " + '\n');
    System.out.println(books);

    books.sort((Book o1, Book o2) -> {
      String title1 = o1.getTitle();
      String title2 = o2.getTitle();
      String author1 = o1.getAuthor();
      String author2 = o2.getAuthor();

      if (o1.getTitle().equals(o2.getTitle())) {
        return o1.getAuthor().compareTo(o2.getAuthor());
      }
      return o1.getTitle().compareTo(o2.getTitle());
    });
    System.out.println(" После сортировки по автору ... " + '\n');
    System.out.println(books);
  }
}
