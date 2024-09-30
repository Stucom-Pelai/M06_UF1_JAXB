package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="product")
@XmlType(propOrder= {"name","price","stock","units"})
public class Product {
	@XmlAttribute(name="name")
	private String name;
	@XmlElement(name="price")
	private Price price;
	@XmlElement(name="stock")
	private Stock stock;
	@XmlElementWrapper(name="units")
	@XmlElement(name="unit")
	private ArrayList<Unit> units;
	
	public Product() {};
	
	public Product(String name, Price price, Stock stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}
	
	public Price getPrice() {
		return price;
	}

	public Stock getStock() {
		return stock;
	}
	
	public ArrayList<Unit> getUnits() {
		return units;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock
				+ ", units=" + units + "]";
	}
	
	
}
