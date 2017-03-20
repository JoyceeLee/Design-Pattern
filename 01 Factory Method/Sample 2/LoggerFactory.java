
public abstract class LoggerFactory {
	public void writeLog() {
		Logger logger = createLogger();
		logger.writeLog();
	}
	
	public abstract Logger createLogger();
}
