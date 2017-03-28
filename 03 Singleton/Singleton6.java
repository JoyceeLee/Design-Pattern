/**
 * 不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * Effective Java Item 3
 */
public enum Singleton6 {
	INSTANCE;
    public void whateverMethod(){  }
}
