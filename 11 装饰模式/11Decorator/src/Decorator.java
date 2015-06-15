//修饰的抽象类
public abstract class Decorator extends SchoolReport{
	//成绩单
	private SchoolReport sr;
	//构造函数传递成绩单
	public Decorator(SchoolReport sr){
		this.sr = sr;
	}
	//报告成绩单
	public void report(){
		this.sr.report();
	}
	//签名
	public void sign(String name){
		this.sr.sign(name);
	}
}
