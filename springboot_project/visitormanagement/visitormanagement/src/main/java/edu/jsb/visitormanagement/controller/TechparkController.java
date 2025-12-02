package edu.jsb.visitormanagement.controller;

import java.util.List;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.jsb.visitormanagement.entity.Techpark;
import edu.jsb.visitormanagement.service.TeckParkService;
import org.springframework.web.bind.annotation.RequestMapping;;

@RequestMapping("/techpark")
@RestController
public class TechparkController {

	@Autowired
	public TeckParkService techparkservice;

	// ! 1. PostMapping

	@PostMapping("/savevisitor")
	public Techpark saveData(@RequestBody Techpark tech) {
		return techparkservice.saveData(tech);
	}

	// ! 2. GetMapping

	@GetMapping("/findvisitors")
	public List<Techpark> fetchAll() {
		return techparkservice.fetchAll();
	}

	@GetMapping("/findperson")
	public Techpark fetchById(@RequestParam long id) {
		return techparkservice.fetchById(id);
	}

	@GetMapping("/findname")
	public Techpark fetchByvisitorName(@RequestParam String name) {
		return techparkservice.fetchByvisitorName(name);
	}

	@GetMapping("/findstatus")
	public List<Techpark> fetchBystatus(@RequestParam String status) {
		return techparkservice.fetchBystatus(status);
	}

	
	@GetMapping("/findphone/{phoneNumber}")
	public Techpark fetchByPhoneNumber(@PathVariable String phoneNumber) {
		return techparkservice.fetchByPhoneNumber(phoneNumber);
	}

	@GetMapping("/fetchallVisitors")
	public List<String> fetchAllvisitors() {
		return techparkservice.fetchAllvisitors();
	}

	@GetMapping("/fetchallcompany")
	public List<String> fetchAllCompanyName() {
		return techparkservice.fetchAllCompanyName();
	}

	@GetMapping("/fetchproofId")
	public Techpark fetchByProofId(String proofId) {
		return techparkservice.fetchByProofId(proofId);
	}

	// ! pattern:- /findbydate?start=YYYY-MM-DDTHH:MM:SS&end=YYYY-MM-DDTHH:MM:SS
	@GetMapping("/createdbetween")
	public List<Techpark> fetchByCreatedAtRange(@RequestParam LocalDateTime start, @RequestParam LocalDateTime end) {
		return techparkservice.fetchByCreatedAtRange(start, end);
	}

    // http://localhost:8080/techpark/createdbetween?start=YYYY-MM-DDTHH:MM:SS&end=YYYY-MM-DDTHH:MM:SS
    // http://localhost:8080/techpark/updatedbetween?start=YYYY-MM-DDTHH:MM:SS&end=YYYY-MM-DDTHH:MM:SS
	@GetMapping("/updatedbetween")
	public List<Techpark> fetchByUpdatedAtRange(@RequestParam LocalDateTime start, @RequestParam LocalDateTime end) {
		return techparkservice.fetchByUpdatedAtRange(start, end);
	}

	// ! 3. DeleteMapping

	@DeleteMapping("/deleteperson/{id}")
	public String deleteById(@PathVariable long id) {
		return techparkservice.deleteById(id);
	}

	@DeleteMapping("/deleteall")
	public String deleteAllentity() {
		return techparkservice.deleteAllentity();
	}

	// ! 4.putMapping
	@PutMapping("/updateperson/{id}")
	public String update(@PathVariable long id, @RequestBody Techpark tech) {
		return techparkservice.update(id, tech);
	}

}
