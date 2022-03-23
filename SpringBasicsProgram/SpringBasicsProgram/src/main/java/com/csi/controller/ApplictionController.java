package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplictionController {
	
	@GetMapping
	public String sayHello()
	{
		return"WELLCOME TO CSI";
	}
	
	@GetMapping("/Address")
	public String sayAddress()
	{
		return"Pune";
	}

	@GetMapping("/Service")
	public String sayService()
	{
		return"Devlopment Softower";
	}


}
