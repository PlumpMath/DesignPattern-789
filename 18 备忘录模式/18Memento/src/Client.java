
public class Client {

	public static void main(String[] args) {
		/*//主角
		Boy boy = new Boy();
		//初始化当前状态
		boy.setState("心情好");
		System.out.println("男孩现在状态");
		System.out.println(boy.getState());
		
		//记录当前状态
		Boy backup = new Boy();
		backup.setState(boy.getState());
		
		//男孩改变状态
		boy.changeState();
		System.out.println("改变状态后");
		System.out.println(boy.getState());
		
		//恢复原状
		boy.setState(backup.getState());
		System.out.println("回复后状态");
		System.out.println(boy.getState());*/
		
		/*//改进一次后
		Boy boy = new Boy();
		//初始化当前状态
		boy.setState("心情好");
		System.out.println("男孩现在状态");
		System.out.println(boy.getState());
		
		Memento mem = boy.createMemento();
		boy.changeState();
		System.out.println("改变状态后");
		System.out.println(boy.getState());
		
		boy.restoreMemento(mem);
		System.out.println("回复后状态");
		System.out.println(boy.getState());*/
		
		//采用备忘录模式的写法
		Boy boy = new Boy();
		Caretaker caretaker = new Caretaker();
		//初始化当前状态
		boy.setState("心情好");
		System.out.println("男孩现在状态");
		System.out.println(boy.getState());
		
		caretaker.setMemento(boy.createMemento());
		
		boy.changeState();
		System.out.println("改变状态后");
		System.out.println(boy.getState());
		
		boy.restoreMemento(caretaker.getMemento());
		System.out.println("回复后状态");
		System.out.println(boy.getState());
	}

}
