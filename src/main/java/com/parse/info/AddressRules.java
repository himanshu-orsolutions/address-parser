package com.parse.info;

import java.util.HashMap;
import java.util.regex.Pattern;

import com.parse.models.Metadata;

/**
 * The AddressRules. It holds information of all address rules.
 */
public abstract class AddressRules {

	private static final String RULE_I = "^(.+)\\ (\\d.*)$"; // Street [SPACE] House Number
	private static final String RULE_II = "^(\\d.*)\\,(.+)$"; // House Number [COMMA] Street
	private static final String RULE_III = "^(\\d[^ ]*)\\ (.+)$";// House Number [Space] Street
	private static final String RULE_IV = "^(.+)\\,\\ *(\\d.*)$"; // Street [Comma] House Number
	private static final String RULE_V = "^(.+)(No\\ *\\d.*)$"; // Street [No] House Number

	/**
	 * The address metadata. It holds the map of rule and a flag which indicates if
	 * the street is present first in the text or not.
	 */
	public static final HashMap<Pattern, Metadata> addressMetadata = new HashMap<>();

	public AddressRules() {
		// Filling the metadata
		addressMetadata.put(Pattern.compile(RULE_I, Pattern.CASE_INSENSITIVE), new Metadata(true, 2));
		addressMetadata.put(Pattern.compile(RULE_II, Pattern.CASE_INSENSITIVE), new Metadata(false, 1));
		addressMetadata.put(Pattern.compile(RULE_III, Pattern.CASE_INSENSITIVE), new Metadata(false, 2));
		addressMetadata.put(Pattern.compile(RULE_IV, Pattern.CASE_INSENSITIVE), new Metadata(true, 1));
		addressMetadata.put(Pattern.compile(RULE_V, Pattern.CASE_INSENSITIVE), new Metadata(true, 1));
	}
}
