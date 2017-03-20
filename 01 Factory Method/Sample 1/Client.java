/*
 * This is the first example of Factory Method Pattern which includes writeLog() of Logger instance in client code
 */
public class Client {
	public static void main(String args[]) {
		LoggerFactory factory;
		Logger logger;
		factory = (LoggerFactory) XMLUtil.getBean();
		logger = factory.createLogger();
		logger.writeLog();
	}
}
