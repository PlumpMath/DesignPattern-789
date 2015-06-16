
public class Client {

	public static void main(String[] args) {
		/*System.out.println("房产公司");
		HouseCorp houseCorp = new HouseCorp();
		houseCorp.makeMoney();
		
		System.out.println("服装公司");
		ClothesCorp clothesCorp = new ClothesCorp();
		clothesCorp.makeMoney();
		
		System.out.println("山寨公司");
		IPodCorp iPodCorp = new IPodCorp();
		iPodCorp.makeMoney();*/
		
		//改造模式后
		House house = new House();
		System.out.println("房地产");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		
		System.out.println("山寨");
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
		shanZhaiCorp.makeMoney();
	}

}
