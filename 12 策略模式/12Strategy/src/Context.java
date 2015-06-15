//锦囊
public class Context {
	//构造函数 使用哪个妙计
	private IStrategy strategy;
	public Context(IStrategy strategy){
		this.strategy = strategy;
	}
	
	public void operate(){
		this.strategy.operate();
	}
}
