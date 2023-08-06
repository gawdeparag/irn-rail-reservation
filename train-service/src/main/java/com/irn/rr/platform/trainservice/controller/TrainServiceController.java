package com.irn.rr.platform.trainservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irn.rr.platform.trainservice.entity.Train;
import com.irn.rr.platform.trainservice.service.TrainService;

@RestController
@RequestMapping("/api/train")
public class TrainServiceController {
	
	@Autowired
	private TrainService trainService;
	
	@PostMapping("/save")
	public void SaveTrain(@RequestBody Train train) {
		try {
			trainService.saveTrain(train);
			System.out.println("Train saved successfully and request went through!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
