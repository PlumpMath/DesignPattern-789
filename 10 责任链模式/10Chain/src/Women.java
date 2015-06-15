
public class Women implements IWomen{

	private int type = 0; //个人状况 1 未出嫁 2 出嫁 3 夫死
	private String request = " "; //妇女请示
	//构造函数传递请求
	public Women(int _type, String _request){
		this.type = _type;
		switch (this.type ) {
		case 1:
			this.request = "女儿的请求" + _request;
			break;
		case 2:
			this.request = "妻子的请求" + _request;
			break;
		case 3:
			this.request = "母亲的请求" + _request;
			break;
		}
	}
	//获得自己状况
	@Override
	public int getType() {
		return type;
	}
	//获取请求
	@Override
	public String getRequest() {
		return request;
	}

}
