package application;

import db.DB;
import model.Department;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        System.out.println(obj);

    }
}