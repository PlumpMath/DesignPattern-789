//具体建造者
public class ConcreteBuilder extends Builder {
	
	private Procuct procuct = new Procuct();
	//设置产品零件
	public void setPart() {

	}
	//组建一个产品
	public Procuct buildProcuct() {
		return procuct;
	}

}
