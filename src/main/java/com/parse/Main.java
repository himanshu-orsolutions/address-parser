package com.parse;

import com.parse.models.Address;
import com.parse.utils.JSONSerializer;

public class Main {

	public static void main(String[] args) {

		Parser parser = new Parser();

		Address address1 = parser.parse("8B , Carit etlars gade YU");
		Address address2 = parser.parse("Musterstrasse 45");
		Address address3 = parser.parse("Blaufeldweg 123B");
		Address address4 = parser.parse("Am Bächle 23");
		Address address5 = parser.parse("Auf der Vogelwiese 23 b");
		Address address6 = parser.parse("4, rue de la revolution");
		Address address7 = parser.parse("200 Broadway Av");
		Address address8 = parser.parse("Calle Aduana, 29");
		Address address9 = parser.parse("Calle 39 No 1540");

		System.out.println(JSONSerializer.serialize(address1));
		System.out.println(JSONSerializer.serialize(address2));
		System.out.println(JSONSerializer.serialize(address3));
		System.out.println(JSONSerializer.serialize(address4));
		System.out.println(JSONSerializer.serialize(address5));
		System.out.println(JSONSerializer.serialize(address6));
		System.out.println(JSONSerializer.serialize(address7));
		System.out.println(JSONSerializer.serialize(address8));
		System.out.println(JSONSerializer.serialize(address9));

	}
}
