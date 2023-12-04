package prototype;


import java.util.HashMap;
import java.util.Map;

import javax.crypto.Mac;

import framework.Product;

public  class Manager {
	
	Product product;
	
	Map<String, Object> showcase
		=new HashMap<String, Object>();
	
	public Manager(Product product) {
		this.product = product;
	}
	
	public Object create() {
		return product.createClone();
	}
	
	public void register(String name,Product product) {
		showcase.put(name, product);
	}
	
}
