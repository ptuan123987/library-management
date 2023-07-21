package com.app.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "ca_id")
    private int ca_id;

    @Column(name = "ca_name")
    private String ca_name;

    @Column(name = "ca_description")
    private String ca_description;

    public Category() {
    }

    public Category(String ca_name) {
        this.ca_name = ca_name;
    }

    public int getCa_id() {
        return ca_id;
    }

    public void setCa_id(int ca_id) {
        this.ca_id = ca_id;
    }

    public String getCa_name() {
        return ca_name;
    }

    public void setCa_name(String ca_name) {
        this.ca_name = ca_name;
    }

    public String getCa_description() {
        return ca_description;
    }

    public void setCa_description(String ca_description) {
        this.ca_description = ca_description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "ca_id=" + ca_id +
                ", ca_name='" + ca_name + '\'' +
                ", ca_description='" + ca_description + '\'' +
                '}';
    }
}
