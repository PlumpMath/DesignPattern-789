## 18 备忘录模式
定义
	再不破坏封装性的前提下 捕获一个对象的内部状态 并在该对象之外保持这个状态
	可以以后将该对象恢复到原先保存的状态
	//发起人
	public class Originator{
		private String state = "";
		public String getState(){
			return state;
		}
		public void setState(String state){
			state = state;
		}
		//创建一个备忘录
		private Memento createMenento(){
			return new Memento(state);
		}
		//恢复一个备忘录
		public void restoreMemento(Memento _memento){
			setState(_memento.getState());
		}
	}
	//备忘录角色
	public class Memento{
		private String state = "";
		public Memento(String _state){
			state = _state;
		}
		
		public String getState(){
			return state;
		}
		
		public String setState(String _state){
			state = _state;
		}
	}
	//备忘录管理员
	public class Caretaker{
		private Memento memento;
		
		public Memento getMemento(){
			return memento;
		}
		
		public void setMemento(Memento memento){
			this.memento = memento;
		}
	}
	
	//场景类
	public class Client{
		public static void main(String[] args){
			Originator originator = new Originator();
			Caretaker caretaker = new Caretaker();
			caretaker.setMemento(originator.createMenento());
			originator.restoreMemento(caretaker.getMemento());
		}
	}
	