package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="stock")
public class Stock {
	@XmlAttribute(name="storage")
	private String storage;
	@XmlAttribute(name="color")
	private String color;
	
	public Stock() {};
	
	public Stock(String storage, String color) {
		this.storage = storage;
		this.color = color;
	}

	public String getStorage() {
		return storage;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Stock [storage=" + storage + ", color=" + color + "]";
	}
	
}
