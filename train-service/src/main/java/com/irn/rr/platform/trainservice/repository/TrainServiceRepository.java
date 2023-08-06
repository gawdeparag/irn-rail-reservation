package com.irn.rr.platform.trainservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irn.rr.platform.trainservice.entity.Train;
//import com.irn.rr.platform.trainservice.entity.TrainType;

public interface TrainServiceRepository extends JpaRepository<Train, Long> {
	Train findByName(String name);
	Train findByNumber(Long number);
	Train findByDeparture(String departure);
	Train findByDestination(String destination);
}
