package Bai2;

public class Documents {
    private String id;
    private String name;
    private String Publisher;
    private Float price;

    public Documents() {
    }

    public Documents(String id, String name, String publisher, Float price) {
        this.id = id;
        this.name = name;
        Publisher = publisher;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
