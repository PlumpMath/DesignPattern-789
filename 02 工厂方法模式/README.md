## 02 工厂方法模式
public class Singleton {
	
	private static final Singleton singleton = new Singleton();
	
	//构造方法 限制产生多个对象
	private Singleton(){
		
	}
	//通过该方法获取实例对象
	public static Singleton getSingleton() {
		return singleton;
	}
	//类中其它方法 尽量static
	public static void doSomething() {
		
	}

}
