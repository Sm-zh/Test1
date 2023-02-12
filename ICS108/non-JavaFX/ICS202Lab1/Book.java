package ICS202Lab1;

public class Book {
    private String title;
    private int page;    

    public Book(String title, int page) {
        this.title = title;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }


    public String toString() {
        return "Book: " + title + ", # Pages = " + page ;
    } 
}

