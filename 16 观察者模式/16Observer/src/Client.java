public class Client {

	public static void main(String[] args) throws InterruptedException{

		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		// 观察早晨
		Spy watchBreakfast = new Spy(hanFeiZi, liSi, "breakfast");
		watchBreakfast.start();

		// 观察娱乐情况
		Spy watchFun = new Spy(hanFeiZi, liSi, "fun");
		watchFun.start();
		
		Thread.sleep(1000);
		hanFeiZi.haveBreakfast();
		
		Thread.sleep(1000);
		hanFeiZi.haveFun();
	}

}
