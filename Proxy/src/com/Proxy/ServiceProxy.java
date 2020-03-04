package com.Proxy;

public class ServiceProxy implements Service {
    private Service service;

    private final int SUBSCRIPTION_COST = 100;

    public ServiceProxy(Service service) {
        this.service = service;
    }

    @Override
    // Method checks if a customer has enough money for subscription
    public void Subscribe(Customer customer) throws Exception {
        if (customer.getMoney() >= SUBSCRIPTION_COST) {
            service.Subscribe(customer);
        } else {
            throw new Exception(String.format("Not enough money! Cost of subscription: %d$. %s has %d$", SUBSCRIPTION_COST, customer.getName(), customer.getMoney()));
        }
    }
}
