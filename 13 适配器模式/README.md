## 12 适配器模式
定义
	将一个类的接口变换成客户端所期待的另一种接口 从而使原本因接口不匹配而无法在一起工作的两个类可以在一起工作
	//目标角色
	public interface Target{
		//目标角色自己的方法
		public void request();
	}
	//目标角色的实现类
	public class ConcreteTarget implement Target{
		public void request(){
			System.out.println("ConcreteTarget");
		}
	}
	//源角色
	public class Adaptee{
		public void doSomething(){
			System.out.println("Adaptee");
		}
	}
	//适配器角色
	public class Adapter extends Adaptee implement Target{
		public void request(){
			super.doSomething();
		}
	}
	//场景类
	public class Client{
		public static void main(String[] args){
			//原有的业务逻辑
			Target target = new ConcreteTarget();
			target.request();
			//增加适配器后的业务逻辑
			Target target2 = new Adapter();
			target2.request();
		}
	
	}