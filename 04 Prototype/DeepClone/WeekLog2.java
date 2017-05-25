import java.io.Serializable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// implements Serializable to create Deep-clonable class
public class WeekLog2 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String date;
	private String content;
	private Attachment attachment;
	
	//...(set and get methods)
	
	public WeekLog2 clone() {
		ByteArrayOutputStream bao = new ByteArrayOutputstream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		ByteArrayInputStream bai = new ByteArrayInputStream(bao);
		ObjectInputStream ois = new ObjectInputStream(bai);
		return (WeekLog2) ois.readObject();
	}
}

// the class of memeber object should also implements Serializable
class Attachment implements Serializable {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}