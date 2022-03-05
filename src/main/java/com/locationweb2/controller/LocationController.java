package com.locationweb2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb2.dto.LocationData;
import com.locationweb2.entities.Locations;
import com.locationweb2.services.LocationService;
import com.locationweb2.utilities.EmailServiceImpl;

@Controller
public class LocationController {
	@Autowired
	private LocationService ser;
	
	@Autowired
	private EmailServiceImpl em;

	@RequestMapping("/create")
	public String VeiwLocatiion() {
		return "location";
	}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("loc") Locations loc) {
		long id = loc.getId();
		System.out.println(id);
		int code = loc.getCode();
		System.out.println(code);
		String name = loc.getName();
		System.out.println(name);
		String type = loc.getType();
		System.out.println(type);
		ser.saveLocations(loc);
		em.sendSimpleMessage("irsamolwaghmare@gmail.com", "last time", "you done your job");
		return "location";
	}
	
//	@RequestMapping("/saveLead")
//	public String saveLead(LocationData ld , ModelMap ModelMap) {
//		Locations loc = new Locations();
//		int id = ld.getId();
//		loc.setId(id);
//		System.out.println(id);
//		int code = ld.getCode();
//		System.out.println(code);
//		loc.setCode(code);
//		String name = ld.getName();
//		System.out.println(name);
//		loc.setName(name);
//		String type = ld.getType();
//		System.out.println(type);
//		loc.setType(type);
//		ser.saveLocations(loc);
//		ModelMap.addAttribute("msg","data saved successfully");
//		return "location";
//	}
//	

	@RequestMapping("/list")
	public String listAllocation(Locations location, ModelMap ModelMap) {
		List<Locations> loc = ser.listlocation();
		ModelMap.addAttribute("location",loc);
		return "listLocation";
	}
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("id") Long id ,ModelMap ModelMap) {
		ser.deletById(id);
		List<Locations> loc = ser.listlocation();
		ModelMap.addAttribute("location",loc);
		return "listLocation";
	}
	
	@RequestMapping("/update")
	public String updateById(@RequestParam("id") Long id ,ModelMap ModelMap) {
		Locations loc = ser.updateById(id);
		ModelMap.addAttribute("location",loc);
		return "updateLocation";
	}
	
	@RequestMapping("/updateLead")
	public String updateLead(@ModelAttribute("location") Locations loc) {
		long id = loc.getId();
		System.out.println(id);
		int code = loc.getCode();
		System.out.println(code);
		String name = loc.getName();
		System.out.println(name);
		String type = loc.getType();
		System.out.println(type);
		ser.saveLocations(loc);
		return "location";
	}
}
