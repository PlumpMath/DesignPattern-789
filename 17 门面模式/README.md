## 17 门面模式
定义
	要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行
	门面模式提供一个高层次的接口 使得子系统更易于使用
	//子系统
	public class ClassA{
		public void doSomethingA(){
			//业务逻辑
		}
	}
	public class ClassB{
		public void doSomethingB(){
			//业务逻辑
		}
	}
	public class ClassC{
		public void doSomethingC(){
			//业务逻辑
		}
	}
	//门面对象
	public class Facade{
		//被委托的对象
		private ClassA a = new ClassA();
		private ClassB b = new ClassB();
		private ClassC c = new ClassC();
		//提供给外部访问的方法
		public void methodA(){
			a.doSomethingA();
		}
		public void methodB(){
			b.doSomethingB();
		}
		public void methodC(){
			c.doSomethingC();
		}
	}