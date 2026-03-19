package net.reed.rumor.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
    public static Logger logger = LogManager.getLogger("p1");

    private static StackTraceElement caller() {
        return new Exception().getStackTrace()[3];
    }

    private static String format(String log) {
        StackTraceElement caller = caller();
        String log2 = caller.getClassName() + " | " + caller.getMethodName() + " | " + caller.getLineNumber() + " | " + log;
        System.out.println(log2);
        return log2;
    }

    public static void info(String log) {
        logger.info(format(log));
    }
    public static void error(String log) {
        logger.error(format(log));
    }
    public static void fatal(String log) {
        logger.fatal(format(log));
    }
    public static void warn(String log) {
        logger.warn(format(log));
    }
}
