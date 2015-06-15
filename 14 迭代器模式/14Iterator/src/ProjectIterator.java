import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {
	//所有项目
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	private int currentItem = 0;
	//构造函数传入
	public ProjectIterator(ArrayList<IProject> projectList) {
		this.projectList = projectList;
	}
	//判断是否还有元素
	@Override
	public boolean hasNext() {
		boolean b = true;
		if ((currentItem >= projectList.size()) || (projectList.get(currentItem) == null)) {
			b = false;
		}
		return b;
	}

	//取得下一个值
	@Override
	public IProject next() {
		return projectList.get(currentItem++);
	}

	@Override
	public void remove() {

	}

}
