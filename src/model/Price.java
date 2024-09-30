package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="price")
public class Price {
	@XmlAttribute(name="badge")
	private String badge;
	
	public Price() {};
	
	public Price(String badge) {
		this.badge = badge;
	}

	public String getBadge() {
		return badge;
	}
	
	@Override
	public String toString() {
		return "Price [badge=" + badge + "]";
	}
	
}
