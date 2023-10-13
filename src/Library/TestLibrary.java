package Library;

public class TestLibrary {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Лев Толстой";
        book.title = "Война и мир";
        book.id = 1;

        Students student = new Students();
        student.name = "Иван";
        student.studentId = 12345;

        Library library = new Library();
        library.availableBook = book;

        student.displayInformation();
        library.lendBook(student);
        student.displayInformation();

        library.acceptBook(student);
        student.displayInformation();
    }
}