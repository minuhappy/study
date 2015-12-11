package com.service.sample;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleService {

	@Autowired
	private SampleRepository userRepository;

	/**
	 * Insert Sample Data
	 * 
	 * @SampleURL : http://localhost:8080/sample/add?userNm=abc&age=10
	 * @param request
	 * @return
	 */
	@RequestMapping("/sample/add")
	@ResponseBody
	public Sample add(HttpServletRequest request) {
		String userNm = request.getParameter("userNm");
		String age = request.getParameter("age");

		Sample sample = new Sample();
		sample.setName(userNm);
		sample.setAge(age);

		Sample sampleData = userRepository.save(sample);
		return sampleData;
	}

	/**
	 * List Sample Data
	 * 
	 * @SampleURL : http://localhost:8080/sample/list
	 * @SampleURL : http://localhost:8080/sample/add?userNm=abc&age=10
	 * @return
	 */
	@RequestMapping("/sample/list")
	@ResponseBody
	public List<Sample> list() {
		List<Sample> sampleList = userRepository.findAll();
		return sampleList;
	}
}