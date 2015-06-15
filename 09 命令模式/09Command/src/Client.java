//场景类
public class Client {
	
	public static void main(String[] args) {
		/*System.out.println("---客户要求增加一项需求---");

		Group rg = new RequirementGroup();
		//找到需求组
		rg.find();
		//增加一个需求
		rg.add();
		//要求变更计划
		rg.plan();
		
		System.out.println("---客户要求删除一个页面---");

		Group pg = new PageGroup();
		//找到美工组
		pg.find();
		//删除一个页面
		pg.delete();
		//要求变更计划
		pg.plan();*/
		
		//使用命令模式后的写法
		//定义接头人
		Invoker xiaoSan = new Invoker();
		System.out.println("---客户要求增加一项需求---");
		//客户下达命令
		Command command = new AddRequriementCommand();
		//接头人接受命令
		xiaoSan.setCommand(command);
		//接头人执行命令
		xiaoSan.action();
		
		System.out.println("---客户要求删除一个页面---");
		Command delCommand = new DeletePageCommand();
		xiaoSan.setCommand(delCommand);
		xiaoSan.action();
	}

}
