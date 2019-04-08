package com.ydk.deepAPI.service;

import com.ydk.deepAPI.domain.BoundingBox;
import com.ydk.deepAPI.domain.Image;

public interface Detection {
	BoundingBox[] detect(Image input);
}
