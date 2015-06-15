## 11 装饰模式
定义
	动态的给一个对象添加一些额外的职责
	
	//抽象构件
	public abstract class Component{
		//抽象方法
		public abstract void operate();
	}
	
	//具体构件
	public class ConcreteComponent extends Component{
		//具体实现
		@Override
		public void operate(){
			System.out.println("do Something");
		}
	
	}
	//抽象装饰者
	public abstract class Decorator extends Component{
		private Component component = null;
		//构造函数传递被修饰者
		public Decorator(Component _component){
			this.component = _component;
		}
		@Override
		public void operate(){
			this.component.operate;
		}
	}
	//具体装饰类
	public class ConcreteDecorator1 extends Component{
		//定义被修饰者
		public ConcreteDecorator1(Component _component){
			super(_component);
		}
		//定义自己的修饰方法
		private void method1(){
			System.out.println("method1 修饰");
		}
		
		@Override
		public void operate(){
			this.method1();
			super.operate();
		}
	}
	
	public class ConcreteDecorator2 extends Component{
		//定义被修饰者
		public ConcreteDecorator2(Component _component){
			super(_component);
		}
		//定义自己的修饰方法
		private void method2(){
			System.out.println("method2 修饰");
		}
		
		@Override
		public void operate(){
			super.operate();
			this.method1();
		}
	}
	
	//场景类
	public class Client{
		public static void main(String[] args){
			Component component = new ConcreteComponent();
			//第一次修饰
			component = new ConcreteDecorator1(component);
			//第二次修饰
			component = new ConcreteDecorator2(component);
			//修饰后允许
			component.operate();
		}
	}
	