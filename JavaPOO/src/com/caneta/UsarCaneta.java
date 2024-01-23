package com.caneta;

public class UsarCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Preto",0.8f);
        c1.status();
        Caneta c2 = new Caneta("OOH", "Verde", 1.5f);
        c2.status();
    }
}
