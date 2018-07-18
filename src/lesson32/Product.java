package lesson32;

import java.time.LocalDate;

public class Product {
    private static int nextID = 1000;
    private long id;
    private int price;
    private String title;
    private LocalDate production;
    private LocalDate expiration;

    public Product() {
        setId();
        this.price = 1000;
        this.title = "product";
        this.production = LocalDate.now();
        this.expiration = LocalDate.now();
    }

    public Product(long id, int price, String title, String production, String expiration) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.production = LocalDate.parse(production);//2018-5-30
        this.expiration = LocalDate.parse(expiration);
    }

    public long getId() {
        return id;
    }

    public void setId() {
        this.id = nextID;
        nextID++;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getProduction() {
        return production;
    }

    public void setProduction(LocalDate production) {
        this.production = production;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", production=" + production +
                ", expiration=" + expiration +
                '}';
    }
}
