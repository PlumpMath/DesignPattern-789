import java.util.Map;

//劳务公司人员信息接口
public interface IOuterUser {
	//员工基本信息
	public Map getUserBaseInfo();
	//工作区域信息
	public Map getUserOfficeInfo();
	//用户家庭信息
	public Map getUserHomeInfo();
}
