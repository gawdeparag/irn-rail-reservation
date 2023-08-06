package com.irn.rr.platform.trainservice.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum TrainType {
	RAJDHANI,
	DURONTO,
	RAJYARANI,
	LUXURY,
	SHATABDI,
	SUBURBAN,
	INTERCITY,
	JANSHATABDI,
	SAMPARKKRANTI,
	GARIBRATH,
	HUMSAFAR,
	VANDEBHARAT,
	GATIMAAN,
	TEJAS,
	SUPERFAST,
	PASSENGER,
	MAIL;
	
	private static final List<TrainType> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();
	
	public static TrainType randomTrainType() {
		System.out.println(values()[(RANDOM.nextInt(SIZE))]);
		return values()[(RANDOM.nextInt(SIZE))];
	}
}
