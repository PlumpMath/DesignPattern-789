
public class PrototypeClass implements Cloneable{

	@Override
	public PrototypeClass clone(){
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass)super.clone();
		} catch (Exception e) {
			// 异常处理
		}
		return prototypeClass;
	}

	
	
}
