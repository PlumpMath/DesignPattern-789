

public class Father {

	public static void main(String[] args) {
		/*SchoolReport sr = new FouthGradeSchoolReport();
		sr.report();
		//签名 休想
*/		
		/*SchoolReport sr = new SugarFouthGradeSchoolReport();
		sr.report();
		sr.sign("老三");*/
		
		//使用装饰模式后
		SchoolReport sr = new FouthGradeSchoolReport();
		sr = new HignScoreDecorator(sr);
		sr = new SortScoreDecorator(sr);
		
		sr.report();
		sr.sign("老三");
	}

}
