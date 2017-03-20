
public class FileLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		// TODO code for creating file log object
		Logger logger = new FileLogger();
		// TODO code for creating file
		return logger;
	}

}
