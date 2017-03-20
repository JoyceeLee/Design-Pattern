
public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		// TODO code for connecting DB
		// TODO code for creating DB log object
		Logger logger = new DatabaseLogger();
		// TODO code for initialize DB logger
		return logger;
	}

}
