//抽象命令类
public abstract class Command {
	protected RequirementGroup rg = new RequirementGroup(); //需求组
	protected PageGroup pg = new PageGroup(); //美工组
	protected CodeGroup cg = new CodeGroup(); //代码组
	//执行命令
	public abstract void execute();
}
