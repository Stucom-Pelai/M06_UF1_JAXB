package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="price")
public class Price {
	private String badge;
	
	public Price() {};
	
	public Price(String badge) {
		this.badge = badge;
	}

	public void setBadge(String badge) {
		this.badge = badge;
	}

	@XmlAttribute(name="badge")
	public String getBadge() {
		return badge;
	}
	
	@Override
	public String toString() {
		return "Price [badge=" + badge + "]";
	}
	
}
