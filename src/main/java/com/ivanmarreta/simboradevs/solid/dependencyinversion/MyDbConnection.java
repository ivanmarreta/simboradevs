package com.ivanmarreta.simboradevs.solid.dependencyinversion;

public class MyDbConnection {

    private MyDbConnectionInterface connection;

    public MyDbConnection(MyDbConnectionInterface connection) {
        this.connection = connection;
    }


    //..this.connection.connect();

    public static void main(String[] args) {
        new MyDbConnection(new MyOracleConnection());


        new MyDbConnection(new MySqlConnection());
    }
}
