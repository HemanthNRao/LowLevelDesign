package LoggingSystem;

public class Main
{
    public static void main(String[] args)
    {
        String message = "";
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(LogLevel.INFO, message);
        logObject.log(LogLevel.DEBUG, message);
        logObject.log(LogLevel.ERROR, message);
    }

}
