
public class Client {
	
	public static void main(String[] args) {
		/*ILetterProcess letterProcess = new LetterProcessImpl();
		letterProcess.writeContext("521");
		letterProcess.fillEnvelope("天涯海角");
		letterProcess.letterInotoEnvelope();
		letterProcess.sendLetter();*/
		
		//增加现代化邮局后
		ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
		String context = "521";
		String address = "天涯海角";
		hellRoadPostOffice.sendLetter(context, address);
	}

}
