//写信过程实现
public class LetterProcessImpl implements ILetterProcess{

	@Override
	public void writeContext(String context) {
		System.out.println("信的内容" + context);
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("收件人地址" + address);
	}

	@Override
	public void letterInotoEnvelope() {
		System.out.println("把信放到邮箱里");
	}

	@Override
	public void sendLetter() {
		System.out.println("邮递信件");
	}

}
