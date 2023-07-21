package com.app.library.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @Column(name = "lo_id")
    private int lo_id;

    @Column(name = "lo_no_of_date")
    private int lo_no_of_date;

    @Column(name = "lo_create_date")
    private Date lo_create_date;

    @ManyToOne
    @JoinColumn(name = "us_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "bo_id")
    private Book book;

    public Loan() {
    }

    public Loan(int lo_no_of_date, Date lo_create_date) {
        this.lo_no_of_date = lo_no_of_date;
        this.lo_create_date = lo_create_date;
    }

    public int getLo_id() {
        return lo_id;
    }

    public void setLo_id(int lo_id) {
        this.lo_id = lo_id;
    }

    public int getLo_no_of_date() {
        return lo_no_of_date;
    }

    public void setLo_no_of_date(int lo_no_of_date) {
        this.lo_no_of_date = lo_no_of_date;
    }

    public Date getLo_create_date() {
        return lo_create_date;
    }

    public void setLo_create_date(Date lo_create_date) {
        this.lo_create_date = lo_create_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "lo_id=" + lo_id +
                ", lo_no_of_date='" + lo_no_of_date + '\'' +
                ", lo_create_date='" + lo_create_date + '\'' +
                ", user='" + user + '\'' +
                ", book='" + book + '\'' +
                '}';
    }
}
