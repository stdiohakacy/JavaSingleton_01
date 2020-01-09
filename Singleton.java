package creational.Singleton;

public class Singleton {
	private static Singleton instance = null;
	public String str;

	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}

}
