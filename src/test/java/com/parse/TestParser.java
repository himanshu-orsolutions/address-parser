package com.parse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.parse.utils.JSONSerializer;

/**
 * The class TestParser. It holds test cases for the address parser.
 */
class TestParser {

	/**
	 * The parser instance
	 */
	Parser parser = new Parser();

	@Test
	void test_simple_I() {
		String input = "Winterallee 3";
		String actualOutput = JSONSerializer.serialize(parser.parse(input));
		String expectedOutput = "{\"street\":\"Winterallee\",\"housenumber\":\"3\"}";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	void test_simple_II() {
		String input = "Musterstrasse 45";
		String actualOutput = JSONSerializer.serialize(parser.parse(input));
		String expectedOutput = "{\"street\":\"Musterstrasse\",\"housenumber\":\"45\"}";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	void test_simple_III() {
		String input = "Blaufeldweg 123B";
		String actualOutput = JSONSerializer.serialize(parser.parse(input));
		String expectedOutput = "{\"street\":\"Blaufeldweg\",\"housenumber\":\"123B\"}";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	void test_intermediate_I() {
		String input = "Am Bächle 23";
		String actualOutput = JSONSerializer.serialize(parser.parse(input));
		String expectedOutput = "{\"street\":\"Am Bächle\",\"housenumber\":\"23\"}";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	void test_intermediate_II() {
		String input = "Auf der Vogelwiese 23 b";
		String actualOutput = JSONSerializer.serialize(parser.parse(input));
		String expectedOutput = "{\"street\":\"Auf der Vogelwiese\",\"housenumber\":\"23 b\"}";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	void test_complex_I() {
		String input = "4, rue de la revolution";
		String actualOutput = JSONSerializer.serialize(parser.parse(input));
		String expectedOutput = "{\"street\":\"rue de la revolution\",\"housenumber\":\"4\"}";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	void test_complex_II() {
		String input = "200 Broadway Av";
		String actualOutput = JSONSerializer.serialize(parser.parse(input));
		String expectedOutput = "{\"street\":\"Broadway Av\",\"housenumber\":\"200\"}";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	void test_complex_III() {
		String input = "Calle Aduana, 29";
		String actualOutput = JSONSerializer.serialize(parser.parse(input));
		String expectedOutput = "{\"street\":\"Calle Aduana\",\"housenumber\":\"29\"}";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	void test_complex_IV() {
		String input = "Calle 39 No 1540";
		String actualOutput = JSONSerializer.serialize(parser.parse(input));
		String expectedOutput = "{\"street\":\"Calle 39\",\"housenumber\":\"No 1540\"}";
		assertEquals(expectedOutput, actualOutput);
	}
}
