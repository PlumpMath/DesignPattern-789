//男孩状态类
public class Boy {

	private String state = "";
	public void changeState() {
		state = "心情可能不好";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//保留一个备份
	public Memento createMemento() {
		return new Memento(state);
	}
	
	//恢复一个备份
	public void restoreMemento(Memento _memento) {
		setState(_memento.getState());
	}
}
