package com.ydk.deepAPI.service;

import org.springframework.stereotype.Service;

import com.ydk.deepAPI.domain.Image;

@ Service("segmentationService")
public class SegmentationService implements Segmentation {

	public SegmentationService() {
	}
	
	@Override
	public Image Segment(Image input) {
		return null;
	}
}
