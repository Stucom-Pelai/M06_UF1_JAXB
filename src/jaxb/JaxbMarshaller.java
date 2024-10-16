package jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import model.Price;
import model.Unit;
import model.Product;
import model.ProductList;
import model.Stock;

public class JaxbMarshaller {
	
	public void init () {
		try {
			JAXBContext context = JAXBContext.newInstance(ProductList.class);
			Marshaller marshaller = context.createMarshaller();
			System.out.println("marshalling... ");
			ProductList products = createXml();
			marshaller.marshal(products, new File("files/productsOutput.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private ProductList createXml() {
		
		ArrayList<Product> products = new ArrayList<>();
		ArrayList<Unit> units = new ArrayList<>();
		units.add(new Unit("S1","N1"));
		units.add(new Unit("S2","N2"));
		units.add(new Unit("S3","N3"));
		
		products.add(new Product("Prod 1", new Price("Pound"), new Stock("12","orange"),units));
		products.add(new Product("Prod 2", new Price("Dollar"), new Stock("56","brown"),units));
		products.add(new Product("Prod 3", new Price("Euro"), new Stock("62","yellow"),units));
		products.add(new Product("Prod 4", new Price("Dollar"), new Stock("806","green"),units));
		products.add(new Product("Prod 5", new Price("Euro"), new Stock("50","dark blue"),units));
		
		// print products
		for (Product p : products) {
			System.out.println(p);
		}
		return new ProductList(products);
	}
}
