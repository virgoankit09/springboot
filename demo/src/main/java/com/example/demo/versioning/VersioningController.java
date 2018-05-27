package com.example.demo.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

	@GetMapping("v1/person")
	public PersonV1 getPersonV1() {
		return new PersonV1("Ankit Garg");
	}
	
	@GetMapping("v2/person")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Ankit", "Garg"));
	}
	
	
	@GetMapping(value="person/param", params="version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Ankit Garg");
	}
	
	@GetMapping(value="person/param", params="version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Ankit", "Garg"));
	}
	
}
