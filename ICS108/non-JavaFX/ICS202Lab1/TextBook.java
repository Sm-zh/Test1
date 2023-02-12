package ICS202Lab1;

public class TextBook extends Book{
    private String course;

    public TextBook(String title, int page, String course) {
        super(title, page);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "TextBook: " + super.getTitle() + ", # Pages = " + super.getPage() + ", Course = " + getCourse();
}
}
