/**
 * 静态内部类
 * 由于 SingletonHolder 是私有的，除了 getInstance() 之外没有办法访问它；
 * 在第一次调用该类时进行类加载，同时构造单例实例，
 * 因此它是懒汉式的（lazy initialization）；
 * 由Java虚拟机来保证其线程安全性,确保该成员 变量只能初始化一次；
 */
public class Singleton5 {
	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}
	private Singleton5 (){}
	public static Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
