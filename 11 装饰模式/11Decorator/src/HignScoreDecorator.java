//最高成绩修饰
public class HignScoreDecorator extends Decorator{

	public HignScoreDecorator(SchoolReport sr) {
		super(sr);
	}

	//汇报最高成绩
	private void reportHighScore(){
		System.out.println("语文最高70 数学最高70 自然最高70");
	}
	//看成绩单前告诉最高成绩
	@Override
	public void report() {
		this.reportHighScore();
		super.report();
	}
	
	
}
