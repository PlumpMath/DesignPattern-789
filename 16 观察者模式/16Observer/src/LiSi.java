//具体观察者
public class LiSi implements ILiSi{

	@Override
	public void update(String context) {
		System.out.println("开始汇报");
		reportToQiShiHuang(context);
		System.out.println("汇报完毕");
	}

	private void reportToQiShiHuang(String reportContext){
		System.out.println("报告---" + reportContext);
	}
}
