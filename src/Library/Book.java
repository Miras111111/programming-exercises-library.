package Library;

public class Book {
    String author;
    String title;
    int id;

    // Метод вывода информации о книге
    public void описание() {
        System.out.println("ID: " + id + " | Книга: '" + title + "' Автора: '" + author + "'");
    }
}
