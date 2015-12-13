package com.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class ScheduleTask {

	@Autowired
	private SimpMessagingTemplate template;

	// this will send a message to an endpoint on which a client can subscribe
	public void trigger() {
		// sends the message to /topic/message
		this.template.convertAndSend("/topic/message", "Date: " + new Date());
	}
}