package com.Proxy;

import java.util.ArrayList;

public class ServiceProxy implements Service {
    private Service service;

    private final int SUBSCRIPTION_COST = 100;

    public ServiceProxy(Service service) {
        this.service = service;
    }

    @Override
    public void Subscribe(Customer customer) throws Exception {
        if (customer.getMoney() >= SUBSCRIPTION_COST) {
            service.Subscribe(customer);
        } else {
            throw new Exception(String.format("Not enough money! Cost of subscription: %d$. %s has %d$", SUBSCRIPTION_COST, customer.getName(), customer.getMoney()));
        }
    }
}
