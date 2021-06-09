package com.interfaces;

//Loggeri SmsLogger e uyarla


public class SmsLogger implements Logger{
    @Override
    public void Log(String message) {

        System.out.println("Sms gönderildi : "+message);

    }
}
