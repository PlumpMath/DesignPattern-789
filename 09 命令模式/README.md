## 09 命令模式
定义
	把一个请求封装成一个对象 从而让你使用不同的请求把客户端参数化
	对请求排队或者记录请求日志 可以提供命令的撤销和恢复功能
	Receiver //接收者角色 干活
	Command //命令角色 需求执行的所有命令
	Invoker //调用者角色 接受命令并执行命令
	
	通用代码
	public abstract class Receiver{
		public abstract void doSomething();
	}
	
	public class ConcreteReceiver1 extends Receiver{
		public void doSomething(){
			//具体业务
		}
	}
	
	public class ConcreteReceiver2 extends Receiver{
		public void doSomething(){
			//具体业务
		}
	}
	
	public abstract class Command{
		//执行命令
		public abstract void execute();
	}
	
	public class ConcreteCommand1 extends Command{
		private Receiver receiver;
		//构造函数传递接受者
		public ConcreteCommand1(Receiver _receiver){
			this.receiver = _receiver;
		}
		//必须实现一个命令
		public void execute(){
			this.receiver.doSomething;
		}
	}
	
	public class ConcreteCommand2 extends Command{
		private Receiver receiver;
		//构造函数传递接受者
		public ConcreteCommand2(Receiver _receiver){
			this.receiver = _receiver;
		}
		//必须实现一个命令
		public void execute(){
			this.receiver.doSomething;
		}
	}
	//调用者
	public class Invoker{
		private Command command;
		//接受命令
		public void setCommand(Command _command){
			this.command = _command;
		}
		//执行命令
		public void action(){
			this.command.execute();
		}
	}
	//场景类
	public class Client{
		public static void main(String[] args) {
		
			Invoker invoker = new Invoker();
			Receiver receiver = new ConcreteReceiver1();
			Command command = new ConcreteCommand1(receiver);
			invoker.setCommand(command);
			invoker.action();
	}

	}
