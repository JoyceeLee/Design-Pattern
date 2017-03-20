
public class Client {
	public static void main(String args[]) {
		LoggerFactory factory;
		factory = (LoggerFactory) XMLUtil.getBean();
		factory.writeLog();
	}
}
