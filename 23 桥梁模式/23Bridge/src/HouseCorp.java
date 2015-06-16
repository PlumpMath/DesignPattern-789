//房地产公司
public class HouseCorp extends Corp{

	public HouseCorp(House house) {
		super(house);
	}

	/*@Override
	protected void produce() {
		System.out.println("盖房子");
	}

	@Override
	protected void sell() {
		System.out.println("卖房子");
	}
	*/
	
	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("赚大钱");
	}
	
	

}
