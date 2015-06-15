
public class Spy extends Thread {

	private HanFeiZi hanFeiZi;
	private LiSi liSi;
	private String type;
	
	public Spy(HanFeiZi _hanFeiZi, LiSi _liSi, String _type)  {
		this.hanFeiZi = _hanFeiZi;
		this.liSi = _liSi;
		this.type = _type;
	}

	@Override
	public void run() {
		while (true) {
			//监控是否在吃早饭
			if (type.equals("breakfast")) {
				if (hanFeiZi.isHavingBreakfast()) {
					liSi.update("韩非子在吃饭");
					hanFeiZi.setHavingBreakfast(false);
				}
			//监控是否在娱乐
			}else {
				if (hanFeiZi.isHavingFun()) {
					liSi.update("韩非子在娱乐");
					hanFeiZi.setHavingFun(false);
				}
			}
		}
	}
	
	
}
