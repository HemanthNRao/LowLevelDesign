package LoggingSystem;

public class InfoLogProcessor extends LogProcessor
{
    InfoLogProcessor(LogProcessor nextLogProcessor)
    {
        super(nextLogProcessor);
    }

    void log(LogLevel logLevel, String message)
    {
        if(logLevel == LogLevel.INFO)
        {
            System.out.println("INFO "+message);
        }
        else
        {
            super.log(logLevel, message);
        }
    }
}
