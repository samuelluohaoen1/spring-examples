package com.daba.dpp;

public class Client {
    public static void main(String[] args) {
        LeaseApt client = new Leaser();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(client);

        // Cast to a interface. Existing methods can be called dynamically
        LeaseApt clientProxy = (LeaseApt) pih.getProxy();

        clientProxy.lease();
    }
}
