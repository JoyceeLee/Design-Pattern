import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import org.xml.sax.SAXException;

public class XMLUtil {
	public static Object getBean() {
		try{
			// create DOM document object
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse(new File("config.xml"));
			
			// grab node that includes class name information
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			Stirng cName = classNode.getNodeValue();
			
			// generate instance of the class and return it
			Class<?> c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
