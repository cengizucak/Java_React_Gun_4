package com.interfaces;

public class EmailLogger implements Logger{
    @Override
    public void Log(String message) {
        System.out.println("Email gönderildi : "+message);
    }
}
