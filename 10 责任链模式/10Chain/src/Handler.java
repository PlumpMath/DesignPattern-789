public abstract class Handler {
	// 采用责任链模式后
	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 1;
	public final static int SON_LEVEL_REQUEST = 1;
	private int level = 0; // 能处理的级别
	private Handler nextHandler; //下一个责任人
	public Handler(int _level) {
		this.level = _level;
	}
	
	public final void HandleMessage(IWomen women) {
		if (women.getType() == this.level) {
			this.response(women);
		}else {
			if (this.nextHandler != null) {
				this.nextHandler.HandleMessage(women);
			}else {
				//没有后续人
				System.out.println("不同意");
			}
		}
	}
	//不属于自己处理的请求 传递到下一环节
	public void setNext(Handler _handler) {
		this.nextHandler = _handler;
	}
	//请示的回应
	protected abstract void response(IWomen women);
}
