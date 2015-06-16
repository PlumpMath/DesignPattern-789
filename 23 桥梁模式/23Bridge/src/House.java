//房子
public class House extends Product{

	@Override
	public void beProducted() {
		System.out.println("生产房子");
	}

	@Override
	public void beSelled() {
		System.out.println("销售房子");
	}

}
