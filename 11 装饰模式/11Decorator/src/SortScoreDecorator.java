
public class SortScoreDecorator extends Decorator{

	public SortScoreDecorator(SchoolReport sr) {
		super(sr);
	}

	//告诉排名情况
	private void reportSort(){
		System.out.println("我是排名38名");
	}
	//看完成绩单后再告诉 加强作用
	@Override
	public void sign(String name) {
		super.sign(name);
		this.reportSort();
	}
	
	
}
