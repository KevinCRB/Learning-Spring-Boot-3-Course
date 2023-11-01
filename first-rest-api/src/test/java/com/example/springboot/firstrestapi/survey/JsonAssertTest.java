package com.example.springboot.firstrestapi.survey;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

class JsonAssertTest {

	@Test
	void jsonAssert_learningBasics() throws JSONException {
		String espectedResponse = """
				{"id":"Question1",
				"description":"Most Popular Cloud Platform Today",
				"correctAnswer":"AWS"}
				""";
		String actualResponse = """
				  {"id":"Question1",
				  "description":"Most Popular Cloud Platform Today",
				  "options":["AWS","Azure","Google Cloud","Oracle Cloud"],
				  "correctAnswer":"AWS"}
				""";
		
		JSONAssert.assertEquals(espectedResponse, actualResponse, false);
	}

}