package com.ivanmarreta.simboradevs.solid.dependencyinversion;

public class MySqlConnection implements MyDbConnectionInterface {
    @Override
    public boolean isConnected() {
        return false; // b logic
    }
}
