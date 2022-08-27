package org.example;
import MyJDBC.MyJDBC;

public class Main {


    public static void main(String[] args) {

        MyJDBC NewJDBC = new MyJDBC();
        System.out.println(NewJDBC.DB_Connection());
    }
}