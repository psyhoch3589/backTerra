package com.example.backterra.Entity.Store;




import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    @Column(name = "title")
    protected String title;
    @Column(name = "prix")
    private double prix;

    public Product(long id, String title, double prix) {
        this.id = id;
        this.title = title;
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @ManyToOne
    @JoinColumn(name = "command_id")
    private Command command;


    public Product() {
    }

    public Product(Command command) {
        this.command = command;
    }

    public Product(long id, String title) {
        this.id = id;
        this.title = title;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", command=" + command +
                '}';
    }
}
