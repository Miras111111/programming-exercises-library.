package Library;

public class Library {
    Book availableBook;  // в библиотеке только одна книга доступна для выдачи

    // Метод выдачи книги студенту
    void lendBook(Students student) {
        if (availableBook != null && student.borrowedBook == null) {
            student.borrowedBook = availableBook;
            availableBook = null;
        } else {
            System.out.println("Книга уже взята или student уже взял книгу!");
        }
    }

    // Метод возврата книги в библиотеку
    void acceptBook(Students student) {
        if (availableBook == null && student.borrowedBook != null) {
            availableBook = student.borrowedBook;
            student.borrowedBook = null;
        } else {
            System.out.println("В библиотеке уже есть книга или у студента нет книги!");
        }
    }
}
