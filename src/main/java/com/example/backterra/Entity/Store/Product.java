package com.example.backterra.Entity.Store;




import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "prix")
    private double prix;
    @ManyToMany(mappedBy = "product")
    private List<Command> command;

    public Product() {
    }

    public Product(Command command) {
        this.command.add(command);
    }

    public Product(long id, String title, double prix) {
        this.id = id;
        this.title = title;
        this.prix = prix;
    }
    public Product(long id, String title) {
        this.id = id;
        this.title = title;
    }
    public void setCommand(List<Command> command) {
        this.command = command;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Command> getCommand() {
        return command;
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
