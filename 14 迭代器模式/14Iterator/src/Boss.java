import java.util.ArrayList;


public class Boss {

	public static void main(String[] args) {
		/*ArrayList<IProject> projectList = new ArrayList<IProject>();
		projectList.add(new Project("星球大战项目", 10, 100000));
		projectList.add(new Project("扭转时空项目", 100, 1000000));
		projectList.add(new Project("超人改造项目", 10000, 100000000));
		
		for (int i = 4; i < 104; i++) {
			projectList.add(new Project("第" + i + "个项目" , i*5, i * 1000));
		}
		
		for (IProject project : projectList) {
			System.out.println(project.getProjectInfo());
		}*/
		
		IProject project = new Project();
		project.add("星球大战项目", 10, 100000);
		project.add("扭转时空项目", 100, 1000000);
		project.add("超人改造项目", 10000, 100000000);
		
		for (int i = 4; i < 104; i++) {
			project.add("第" + i + "个项目" , i*5, i * 1000);
		}
		
		IProjectIterator projectIterator = project.iterator();
		while (projectIterator.hasNext()) {
			IProject p = (IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}

}
