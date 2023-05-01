package LoggingSystem;

public class LogProcessor
{
    LogProcessor nextLogProcessor;
    LogProcessor(LogProcessor logProcessor)
    {
        nextLogProcessor = logProcessor;
    }

    void log(LogLevel logLevel, String message)
    {
        if(logLevel!=null)
        {
            nextLogProcessor.log(logLevel, message);
        }
    }
}
