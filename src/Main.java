import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Reader[] arr = new Reader[2];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Ведите ваше ФИО: ");
            String FIO = in.next();
            System.out.print("Факультатив: ");
            String faculty = in.next();
            System.out.print("Дата рождения: ");
            String dateOfBirth = in.next();
            System.out.print("Телефон: ");
            String phone = in.next();
            System.out.print("Номер билета: ");
            int numberOfTicket = in.nextInt();
            arr[i] = new Reader(FIO, numberOfTicket, dateOfBirth, faculty, phone);
        }
        String[] book = {"Война и мир", "Ветер крепчает"};
        arr[0].takeBook(1);
        arr[0].returnBook(1);
        arr[0].takeBook(book);
        arr[0].returnBook(book);
    }

}
class Reader{
    String FIO, dateOfBirth, faculty, phone;
    int numberOfTicket;
    Reader(String FIO, int numberOfTicket, String dateOfBirth, String faculty, String phone){
        this.FIO = FIO;
        this.numberOfTicket = numberOfTicket;
        this.dateOfBirth = dateOfBirth;
        this.faculty = faculty;
        this.phone = phone;
    }
    public void takeBook(int numOfBooks) {
        System.out.println(this.FIO + " взял(а) " + numOfBooks + " книгy(и)");
    }
    public void returnBook(int numOfBooks) {
        System.out.println(this.FIO + " вернул(а) " + numOfBooks + " книгу(и)");
    }
    public void takeBook(String[] bookTitles) {
        String books = String.join(", ",bookTitles);
        System.out.println(this.FIO + " взял(а) книги: " + books + ".");
    }
    public void returnBook(String[] bookTitles) {
        String books = String.join(", ",bookTitles);
        System.out.println(this.FIO + " вернул(а) книги: " + books + ".");
    }

}