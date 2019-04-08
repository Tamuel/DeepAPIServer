package com.ydk.deepAPI.service;

import org.springframework.stereotype.Service;
import org.tensorflow.*;

import com.ydk.deepAPI.domain.BoundingBox;
import com.ydk.deepAPI.domain.Image;


@Service("detectionService")
public class DetectionService implements Detection {
	
	public DetectionService() {
		
	}
	
	@Override
	public BoundingBox[] detect(Image input) {
		// TODO Auto-generated method stub
		return null;
	}
}
