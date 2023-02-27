/**
 * 
 */
package com.example.learning.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dell
 *
 */
@RestController
@RequestMapping("/learning")

public class ControllerClass {
	
	@GetMapping("/cltrmethod")
	public String cltrmethod(@RequestParam String name) {
		String msg = "Hi "+name;
		return msg;
	}

	@PostMapping("/postmethod")
	public String postmethod() {
		String msg = "this is a post mapping method";
		return msg;
	}
	@PutMapping("/putmethod")
	public String putmethod() {
		String msg = "this is a put mapping method";
		return msg;
	}
	
	@PatchMapping("/patchmethod")
	public String patchmethod() {
		String msg = "this is a patch mapping method";
		return msg;
	}
	
	@DeleteMapping("/deletemethod")
	public String deletemethod() {
		String msg = "this is a delete mapping method";
		return msg;
	}
	
}
