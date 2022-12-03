package com.example.backterra.Entity.user;


import javax.persistence.*;

@MappedSuperclass
    public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;
    @Column(name = "username" )
    protected String username;
    @Column(name = "firstName" )
    protected String firstName;
    @Column(name = "lastName" )
    protected String lastName;
    /*@Column(name = "birthday" )
    protected LocalDate birthday;*/
    @Column(name = "Phone" )
    protected String Phone;
    @Column(name = "email" )
    protected String email;
    @Column(name = "password" )
    protected String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;*/
    //}

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String firstName, String lastName, String phone, String email, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        //this.birthday = birthday;
        Phone = phone;
        this.email = email;
        this.password = password;
    }


    public User(String username, String firstName, String email, String password) {
        this.username = username;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }

    public User(long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
    }


    public User(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                //", birthday=" + birthday +
                ", Phone='" + Phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
