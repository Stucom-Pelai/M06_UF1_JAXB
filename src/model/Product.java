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
	private String name;
	private Price price;
	private Stock stock;
	private ArrayList<Unit> units = new ArrayList<>();  // Initialize units
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void setUnits(ArrayList<Unit> units) {
		this.units = units;
	}

	public Product() {};
	
	public Product(String name, Price price, Stock stock, ArrayList<Unit> units) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.units = units;
	}

	@XmlAttribute(name="name")
	public String getName() {
		return name;
	}
	
	@XmlElement(name="price")
	public Price getPrice() {
		return price;
	}

	@XmlElement(name="stock")
	public Stock getStock() {
		return stock;
	}
	
	@XmlElementWrapper(name="units")
	@XmlElement(name="unit")
	public ArrayList<Unit> getUnits() {
		return units;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock
				+ ", units=" + units + "]";
	}
	
	
}
