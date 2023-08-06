package com.irn.rr.platform.trainservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irn.rr.platform.trainservice.entity.Train;
import com.irn.rr.platform.trainservice.entity.TrainType;
import com.irn.rr.platform.trainservice.repository.TrainServiceRepository;
import com.irn.rr.platform.trainservice.service.TrainService;

@Service
public class TrainServiceImpl implements TrainService {
	
	@Autowired
	private TrainServiceRepository trainServiceRepository;
	
	@Override
	public void saveTrain(Train train) {
		try {
			train.setTrainType(TrainType.randomTrainType());
			trainServiceRepository.save(train);
			System.out.println("Train Details Saved successfully!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
