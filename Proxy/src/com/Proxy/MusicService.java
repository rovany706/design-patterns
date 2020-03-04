package com.Proxy;

import java.util.ArrayList;

public class MusicService implements Service {
    @Override
    public void Subscribe(Customer customer) {
        System.out.println(String.format("%s is now subscribed!", customer.getName()));
    }
}
