
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport{
	//美化成绩
	private void reportHighScore(){
		System.out.println("语文最高70 数学最高70 自然最高70");
	}
	//汇报排名情况
	private void reportSort(){
		System.out.println("我是排名38名");
	}
	@Override
	public void report() {
		//先说最高成绩
		this.reportHighScore();
		//然后老爸看成绩单
		super.report();
		//最后告诉排名
		this.reportSort();
	}

	
}
