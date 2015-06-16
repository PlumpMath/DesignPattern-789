//备忘录
public class Memento {

	private String state = "";
	
	public Memento(String _state) {
		state = _state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
