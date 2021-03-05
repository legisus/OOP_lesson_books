import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Reader reader1= new Reader("Петров В.В.", 1, "ИФ", "21.10.1999", "+806711111");
        Reader reader2 = new Reader("Иванов И.И.", 2, "ИФ", "11.11.1997", "+806722222");
        Reader reader3 = new Reader("Сидоров А.А.", 3, "ИФ", "05.04.2005", "+806733333");
        Reader [] readers = {reader1, reader2, reader3};

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book[] books = new Book[]{book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(5);
        reader2.takeBook("wdcedqd", "sldjcknls");


    }

    public static void printReaders(Reader[] readers){
        System.out.println("Список читателей: ");
        for (Reader reader : readers){
            System.out.println(reader.toString());
        }
        System.out.println();
    }

    public static void printBooks (Book[]books){
        System.out.println("Список книг: ");
        for (Book book : books){
            System.out.println(book.toString());
        }
    }

}
