import java.util.HashMap;
import java.util.Map;


public class OuterUser implements IOuterUser {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "姓名");
		baseInfoMap.put("mobileNumber", "电话");
		return baseInfoMap;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap homeInfo = new HashMap();
		homeInfo.put("homeTelNumber", "家庭电话");
		homeInfo.put("homeAddress", "家庭地址");
		return homeInfo;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap officeInfo = new HashMap();
		officeInfo.put("jobPosition", "职位");
		officeInfo.put("officeTelNumber", "办公电话");
		return officeInfo;
	}

}
