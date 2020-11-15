package com.ivanmarreta.simboradevs.solid.interfacesegregation;

public class RestauranteOnlineClientImpl implements RestaurantInterface {
    @Override
    public void acceptOnlineOrder() {

    }

    @Override
    public void takeTelephoneOrder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void payOnline() {

    }

    @Override
    public void walkInCustomerOrder() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void payInPerson() {
        throw new UnsupportedOperationException();
    }
}
