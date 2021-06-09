package com.interfaces;

public class Utils {  //! Utils  araclar demektir
    public static void runLogger(Logger[] loggers, String message){
        for (Logger logger : loggers) {
            logger.Log(message);
        }
    }
}
