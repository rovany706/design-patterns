package com.Proxy;

/*
* Программа для обеспечения оплаты подписок на сервисы.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Customer donald = new Customer("Donald Trump", 500);
        Customer john = new Customer("John", 50);

        Service musicService = new MusicService();
        Service proxyService = new ServiceProxy(musicService);

        // Subscribe first customer
        try {
            proxyService.Subscribe(donald);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Subscribe second customer
        try {
            proxyService.Subscribe(john);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
