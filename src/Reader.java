import java.awt.print.Book;
import java.util.Date;

public class Reader {
    private String fio;
    private int idNumber;
    private String faculty;
    private String birthData;
    private String phoneNumber;

    public Reader(String fio, int idNumber, String faculty, String birthData, String phoneNumber) {
        this.fio = fio;
        this.idNumber = idNumber;
        this.faculty = faculty;
        this.birthData = birthData;
        this.phoneNumber = phoneNumber;
    }

    public Reader() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthData() {
        return birthData;
    }

    public void setBirthData(String birthData) {
        this.birthData = birthData;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fio + " взял " + numberOfBooks + " книги.");

    }

    public void takeBook(String... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAutor);
        }
        System.out.println();
    }



    public void returnBook(int numberOfBooks) {
        System.out.println(fio + " вернул " + numberOfBooks + " книги.");

    }



    public void returnBook(String... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook (Book... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAutor);
        }
        System.out.println();
    }





    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", idNumber=" + idNumber +
                ", faculty='" + faculty + '\'' +
                ", birthData='" + birthData + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
