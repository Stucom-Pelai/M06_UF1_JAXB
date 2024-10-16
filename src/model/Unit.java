package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="unit")
public class Unit {
	private String section;
	private String number;
	
	public Unit() {};

	public Unit(String section, String number) {
		super();
		this.section = section;
		this.number = number;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@XmlElement(name="section")
	public String getSection() {
		return section;
	}

	@XmlElement(name="number")
	public String getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Unit [section=" + section + ", number=" + number + "]";
	}
	
}
