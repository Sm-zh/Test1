package ICS202Lab1;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] arge) {
        Scanner input = new Scanner(System.in);
        Book[] books = new Book[10];
        books[0] = new Book("ABC", 100);
        books[1] = new Book("Arabic", 100);
        books[2] = new TextBook("Data Structure, ICS-202", 200, "ICS-202");
        books[3] = new TextBook("Writing Practice, ENGL-101", 300, "ENGL-101");
        books[4] = new TextBook("Algebra, MATH-101", 500, "MATH-101");
        books[5] = new Book("Water Conservation", 200);
        books[6] = new Book("Environment", 150);
        books[7] = new Book("Tech yourself Visual c++", 300);
        books[8] = new Book("NoteBook", 300);
        books[9] = new TextBook("Introduction to Technology, TECH-102", 500, "TECH-102");
        int bookCount = 0;
        int textCount = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(books[i]);
            if (books[i] instanceof TextBook) {
            }
            else {
                bookCount++;
            }
        }
        System.out.println("Number of Books = " + bookCount + "\nNumber of TextBooks = " + textCount);
        input.close();
    }
    
}
