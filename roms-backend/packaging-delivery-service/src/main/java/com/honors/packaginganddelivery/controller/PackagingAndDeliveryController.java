package com.honors.packaginganddelivery.controller;

import com.honors.packaginganddelivery.service.PackagingAndDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/packagingAndDelivery")
public class PackagingAndDeliveryController {
	 public PackagingAndDeliveryService packagingAndDeliveryService;

	    @Autowired
	    public PackagingAndDeliveryController(PackagingAndDeliveryService packagingAndDeliveryService) {
	        this.packagingAndDeliveryService = packagingAndDeliveryService;
	    }

	    @GetMapping("/getCharge/{componentType}/{count}")
	    public double getPackagingAndDeliveryCharge(@PathVariable String componentType, @PathVariable int count) {
	        return packagingAndDeliveryService.getCharge(componentType, count);
	    }

}
