package com.parse;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.parse.info.AddressRules;
import com.parse.models.Address;
import com.parse.models.Metadata;

/**
 * The class Parser. It holds different rules to parse the address from a plain
 * text.
 */
public class Parser extends AddressRules {

	/**
	 * Instantiating the parser
	 */
	public Parser() {
		super();
	}

	/**
	 * Parses the address from the plain text
	 * 
	 * @param plainText The plain text
	 * @return The address object
	 */
	public Address parse(String plainText) {

		Address address = new Address();
		Set<Pattern> rulesSet = addressMetadata.keySet();
		int precedence = Integer.MAX_VALUE;

		for (Pattern rule : rulesSet) { // Iterating over the rules
			Matcher matcher = rule.matcher(plainText);
			if (matcher.find()) {
				String elementI = matcher.group(1);
				String elementII = matcher.group(2);
				Metadata metadata = addressMetadata.get(rule);

				if (metadata.getPrecedence() < precedence) {
					precedence = metadata.getPrecedence();

					if (metadata.getIsStreetFirst()) { // Street is present first in the text
						address.setStreet(elementI.trim());
						address.setHousenumber(elementII.trim());
					} else {
						address.setStreet(elementII.trim());
						address.setHousenumber(elementI.trim());
					}
				}
			}
		}

		return address;
	}
}
