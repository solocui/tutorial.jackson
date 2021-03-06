package com.newday.tutorial.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustomCarSerializer extends StdSerializer<Car> {
	public CustomCarSerializer() {
		this(null);
	}

	public CustomCarSerializer(Class<Car> t) {
		super(t);
	}	

	@Override
	public void serialize(Car car, JsonGenerator jsonGenerator, SerializerProvider provider) throws IOException {
		jsonGenerator.writeStartObject();
		jsonGenerator.writeStringField("Car_brand", car.getType());
		jsonGenerator.writeEndObject();		
	}
}
