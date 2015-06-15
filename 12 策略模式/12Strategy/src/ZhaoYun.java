
public class ZhaoYun {
	
	public static void main(String[] args) {
		Context context;
		//拆第1个
		System.out.println("拆第1个");
		context = new Context(new BackDoor());
		context.operate();
		
		System.out.println("拆第2个");
		context = new Context(new GivenGreenLight());
		context.operate();
		
		System.out.println("拆第3个");
		context = new Context(new BackDoor());
		context.operate();
	}

}
