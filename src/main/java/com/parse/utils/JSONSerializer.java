package com.parse.utils;

import com.google.gson.Gson;

/**
 * The utility class JSONSerializer. It holds implementation to serialize the
 * models to JSON string.
 */
public class JSONSerializer {

	private JSONSerializer() {
		// Its a utility class. Instantiation is not allowed.
	}

	/**
	 * Serializes the model to JSON string
	 * 
	 * @param model The model
	 * @return The JSON string
	 */
	public static String serialize(Object model) {

		try {
			return new Gson().toJson(model);
		} catch (Exception exception) {
			System.out.println("Error: Object serialization failed. Exception: " + exception.toString());
		}
		return "";
	}
}
