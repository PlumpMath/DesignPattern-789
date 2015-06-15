## 12 策略模式
定义
	定义一组算法 将每个算法都封装起来 并且使它们之间可以互换
	//抽象策略角色
	public interface Strategy{
		public void doSomething();
	}
	//具体策略角色
	public class ConcreteStrategy1 implements Strategy{
		public void doSomething(){
			System.out.println("具体策略1");
		}
	}
	
	public class ConcreteStrategy2 implements Strategy{
		public void doSomething(){
			System.out.println("具体策略2");
		}
	}
	
	//封装角色
	public class Context{
		private Strategy strategy = null;
		public Context(Strategy _strategy){
			this.strategy = _strategy;
		}
		public void doAnything(){
			this.strategy.doSomething;
		}
	}
	
	//场景类
	public class Client{
		public static void main(String[] args){
			//声明一个具体策略
			Strategy strategy = new ConcreteStrategy1();
			声明上下文
			Context context = new Context(strategy);
			//执行封装后的方法
			context.doAnything
		
		}
	}