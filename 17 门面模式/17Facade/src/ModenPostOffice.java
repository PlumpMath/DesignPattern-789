//现代化邮局
public class ModenPostOffice {

	ILetterProcess letterProcess = new LetterProcessImpl();
	Police letterPolice = new Police();
	//写信 封装 投递 一体化
	public void sendLetter(String context, String address) {
		letterProcess.writeContext(context);
		letterProcess.fillEnvelope(address);
		//警察检查信件
		letterPolice.checkLetter(letterProcess);
		letterProcess.letterInotoEnvelope();
		letterProcess.sendLetter();
	}
}
