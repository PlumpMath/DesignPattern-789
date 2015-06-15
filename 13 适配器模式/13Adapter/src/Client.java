
public class Client {
	
	public static void main(String[] args) {
		/*IUserInfo youngGirlInfo = new UserInfo();
		for (int i = 0; i < 101; i++) {
			youngGirlInfo.getMobileNumber();
		}*/
		
		//查看劳务公司
		IUserInfo youngGirlInfo = new OuterUserInfo();
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
			youngGirlInfo.getMobileNumber();
		}
	}

}
