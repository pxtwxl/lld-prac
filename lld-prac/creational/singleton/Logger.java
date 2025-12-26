package org.creational.singleton;

public class Logger {
    private static Logger logger = null;
    private Logger() {}  // private constructor to avoid external instantiation

    public static Logger getLogger() {
        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public static void log(String message) {
        System.out.println("Log: "+message);
    }
}
