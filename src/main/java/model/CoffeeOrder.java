package model;

import java.util.Map;


public class CoffeeOrder {
	private String type;
	private String size;
	private String sugar;
	private int price;
	private static final Map<String,String>SizeMap=Map.of("S","小","M","中","L","大");
	private static final Map<String,String>SugarMap=Map.of("true","有糖","false","無糖");
	public CoffeeOrder(String type,String size,String sugar) {
		this.type=type;
		this.size=size;
		this.sugar=sugar;
	}
	
	private static final Map <String,Map>types=Map.of(
			"Latte",Map.of("S",50,"M",70,"L",90),
			"Mocha",Map.of("S",45,"M",55,"L",65),
			"Americano",Map.of("S",40,"M",45,"L",60),
			"Cappuccino",Map.of("S",55,"M",80,"L",100)
			);
	public String getInfo() {
		String sizetext=SizeMap.get(size);
		String sugartext=SugarMap.get(sugar);
		price=(int) types.get(type).get(size);
		return String.format("您點了一杯 %s杯 %s 咖啡(%s)價格:%d元",sizetext,type,sugartext,price);
	}
	public String getType() {
		return type;
	}
	public String getSize() {
		return size;
	}
	public String getSugar() {
		return sugar;
	}
	public int getPrice() {
		return price;
	}

	
	}

