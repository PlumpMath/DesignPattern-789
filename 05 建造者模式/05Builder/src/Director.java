//导演类
public class Director {
	
	private Builder builder = new ConcreteBuilder();
	//构建不同的产品
	public Procuct getAProcuct() {
		builder.setPart();
		
		return builder.buildProcuct();
	}

}
