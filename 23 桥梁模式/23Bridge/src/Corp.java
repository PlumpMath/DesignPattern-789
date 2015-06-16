//抽象公司
public abstract class Corp {
	/*//生产
	protected abstract void produce();
	//销售
	protected abstract void sell();
	
	public void makeMoney(){
		produce();
		sell();
	}*/
	
	//改造后
	private Product product;
	public Corp(Product product){
		this.product = product;
	}
	
	public void makeMoney(){
		product.beProducted();
		product.beSelled();
	}
}
