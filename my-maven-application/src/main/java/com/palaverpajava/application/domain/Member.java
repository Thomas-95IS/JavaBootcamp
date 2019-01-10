package com.palaverpajava.application.domain;

import com.palaverpajava.application.domain.markers.Physical;


public class Member implements Physical {
    private String name;
    private int age;
    private int nBorrowedItems;

    public String toString() {
        String details;
        details = "name: " + this.name + "\nage: " + this.age + "\nNumber of items borrowed: " + this.nBorrowedItems;

        return details;
    }

    public void itemBorrowed() {
        this.nBorrowedItems += 1;
    }

    public void itemReturned() {
        this.nBorrowedItems -= 1;
    }
}