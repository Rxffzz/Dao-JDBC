package application;

import db.DB;
import model.Department;
import model.Seller;

import java.sql.Connection;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        System.out.println(obj);

        Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 2000.0, obj);

        System.out.println(seller);

    }
}