package Bai2;

public class Books extends Documents{
    private Integer numberOfPage;
    private String author;

    public Books(Integer numberOfPage, String author) {
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public Books(String id, String name, String publisher, Float price, Integer numberOfPage, String author) {
        super(id, name, publisher, price);
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public Integer getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(Integer numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
