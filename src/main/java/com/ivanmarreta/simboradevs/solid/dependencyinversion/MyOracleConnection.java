package com.ivanmarreta.simboradevs.solid.dependencyinversion;

public class MyOracleConnection implements MyDbConnectionInterface {
    @Override
    public boolean isConnected() {
        return false;
    }
}
