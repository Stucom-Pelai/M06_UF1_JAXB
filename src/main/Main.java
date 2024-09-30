package main;

import jaxb.JaxbMarshaller;
import jaxb.JaxbUnMarshaller;

public class Main {

	public static void main(String[] args) {
		// from xml2java
		(new JaxbUnMarshaller()).init();
		// from java2xml
		(new JaxbMarshaller()).init();
	}

}
