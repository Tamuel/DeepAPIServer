package com.ydk.deepAPI.controller;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ydk.deepAPI.domain.Greeting;
import com.ydk.deepAPI.domain.Image;

@RestController // @ResponseBody를 모든 메소드에 적용시켜줌 (JSON형태로 반환)
public class APIController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping(value="/segmentation", method=RequestMethod.GET)
	public Image segmentation(@RequestParam(value="name", required=true, defaultValue="World") String name) {
		Image segResult = new Image(512, 512);
		return segResult;
	}
	
	@GetMapping(
		value = "/image/{id}",
		produces = MediaType.IMAGE_JPEG_VALUE
	)
	public byte[] getImage(@PathVariable("id") int id) throws IOException {
	    InputStream in = getClass().getResourceAsStream("/" + id + ".jpg");
	    return IOUtils.toByteArray(in);
	}
}
