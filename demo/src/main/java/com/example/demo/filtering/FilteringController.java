package com.example.demo.filtering;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public MappingJacksonValue retrieve() {
		Filtering obj = new Filtering("value1", "value2", "value3");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
		
		FilterProvider provider = new SimpleFilterProvider().addFilter("somebeanfilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(obj);
		
		mapping.setFilters(provider);
		return mapping;
	}

}