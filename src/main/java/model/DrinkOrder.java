package model;
import java.util.Map;
public class DrinkOrder {
private String type;
private String size;
private String ice;
private int price ;
private static Map<String,String>iceMap=Map.of("yes","加冰","no","去冰");
private static Map<String,Map>PriceMap=
	Map.of("greenTea",Map.of("S",30,"M",50,"L",50),
		"blackTea",Map.of("S",45,"M",55,"L",65),
		"milkTea",Map.of("S",40,"M",45,"L",60));
	public DrinkOrder(String type,String size,String ice) {
		this.type=type;
		this.size=size;
		this.ice=ice;
	}
	public String getInfo() {
		String icetext=iceMap.get(ice);
		price=(int) PriceMap.get(type).get(size);
		return String.format("你點了一杯%S杯%s(%S):%d元",size,type,icetext,price);
	}
	public String getType() {
		return type;
	}
	public String getSize() {
		return size;
	}
	public String getIce() {
		return ice;
	}
	
}
