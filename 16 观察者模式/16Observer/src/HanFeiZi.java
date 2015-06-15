//具体的被观测者
public class HanFeiZi implements IHanFeiZi{
	
	private boolean isHavingBreakfast = false;
	private boolean isHavingFun = false;
	
	@Override
	public void haveBreakfast() {
		System.out.println("吃饭");
		isHavingBreakfast = true;
	}

	@Override
	public void haveFun() {
		System.out.println("娱乐");
		isHavingFun = true;
	}

	public boolean isHavingBreakfast() {
		return isHavingBreakfast;
	}

	public void setHavingBreakfast(boolean isHavingBreakfast) {
		this.isHavingBreakfast = isHavingBreakfast;
	}

	public boolean isHavingFun() {
		return isHavingFun;
	}

	public void setHavingFun(boolean isHavingFun) {
		this.isHavingFun = isHavingFun;
	}

	
}
