//项目信息接口
public interface IProject {
	/*//项目信息
	public String getProjectInfo();*/
	
	//使用迭代器模式
	//增加项目
	public void add(String name, int num, int cost);
	//获得项目信息
	public String getProjectInfo();
	//获得一个可以遍历的对象
	public IProjectIterator iterator();
}
