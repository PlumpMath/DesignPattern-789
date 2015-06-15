
/*public class Father implements IHandler{
	//未出嫁女儿请求父亲
	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("女儿的请示是---" + women.getRequest());
		System.out.println("父亲的答复是---同意");
	}

}*/

public class Father extends Handler{

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}
	//父亲的答复
	protected void response(IWomen women){
		System.out.println("女儿的请示是---" + women.getRequest());
		System.out.println("父亲的答复是---同意");
	}
}
