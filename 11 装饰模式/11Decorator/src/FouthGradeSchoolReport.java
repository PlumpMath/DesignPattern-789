
public class FouthGradeSchoolReport extends SchoolReport{

	@Override
	public void report() {
		System.out.println("尊敬的家长");
		System.out.println("语文 60 数学 60 自然 60 品德 60");
	}

	@Override
	public void sign(String name) {
		System.out.println("家长签名---" + name);
	}

}
