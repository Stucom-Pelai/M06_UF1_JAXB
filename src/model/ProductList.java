package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="products")
public class ProductList {
	
	@XmlElement(name="product")
	private ArrayList<Product> products;
	
	public ProductList() {};
	
	public ProductList(ArrayList<Product> products) {
		this.products = products;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}
	
}
