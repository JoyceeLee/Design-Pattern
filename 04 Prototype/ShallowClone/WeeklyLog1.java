
// Clonable - the implements class support clone
// super.clone() - create and return a copy of this object
// No copy and creation of memeber object
public class WeeklyLog1 implements Cloneable {
	private String name;
	private String date;
	private String content;
	
	public WeeklyLog1 clone() {
		Object obj = null;
		try {
			obj = super.clone(); // Shallow clone
			return (WeeklyLog1) obj;
		} catch (CloneNotSupportedException e) {
			System.out.println("Not support clone");
			return null;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void writeLog() {
		System.out.println(name + "(" + date + "):\n\t"+content);
	}
	public static void main(String args[]) {
		WeeklyLog1 sample = new WeeklyLog1();
		sample.setName("Tom");
		sample.setDate("02/01/2016");
		sample.setContent("Busy week, but happy.");
		
		WeeklyLog1 log = sample.clone();
		log.setDate("02/07/2016");
		
		sample.writeLog();
		log.writeLog();
	}
}
