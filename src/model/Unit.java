package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="unit")
public class Unit {
	@XmlElement(name="section")
	private String section;
	@XmlElement(name="number")
	private String number;
	
	public Unit() {};

	public String getSection() {
		return section;
	}

	public String getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Unit [section=" + section + ", number=" + number + "]";
	}
	
}
