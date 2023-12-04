package idcard;

import framework.Product;
import framework.Factory;

public class IDCardFactory 	extends Factory{

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	
	protected void registerProduct(Product product) {
		System.out.println(product+ "을 등록했습니다.");
	}
	
}
