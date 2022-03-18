package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLogger {
    private static Logger logger = LogManager.getLogger(MyLogger.class.getName());

    public static void info(String message){
        logger.info(message);
    }
}
