package com.scottlogic.gradtrader.slim.scripts;

public class Forex {
    private String from;
    private String to;

    public Forex(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String from() {
        return from;
    }


    public String to() {
        return to;
    }

    public String status() {
        return "Sell failure";
    }
}
