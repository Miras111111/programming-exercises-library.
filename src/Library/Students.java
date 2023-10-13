package Library;

public class Students {
    String name;
    int studentId;
    Book borrowedBook;  // каждый студент может взять только одну книгу

    // Метод вывода информации о студенте
    public void displayInformation() {
        System.out.println("Студент: " + name + " | Номер зачетки: " + studentId);
        if (borrowedBook != null) {
            System.out.print("Взята книга: ");
            borrowedBook.описание();
        } else {
            System.out.println("Книги нет.");
        }
    }
}