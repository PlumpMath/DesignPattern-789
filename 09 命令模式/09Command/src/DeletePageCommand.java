//删除页面的命令
public class DeletePageCommand extends Command{

	@Override
	public void execute() {
		super.pg.find();
		super.pg.delete();
		super.pg.plan();
	}

}
