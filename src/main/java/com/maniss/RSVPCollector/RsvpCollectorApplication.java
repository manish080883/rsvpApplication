package com.maniss.RSVPCollector;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;

@SpringBootApplication
public class RsvpCollectorApplication {

	private static final String MEETUP_RSVP_ENDPOINT = "ws://stream.meetup.com/2/rsvps";

	public static void main(String[] args)
	{
		SpringApplication.run(RsvpCollectorApplication.class, args);
	}

	@Bean
	public ApplicationRunner initializeConnection(RSVPWebSocketHandler rsvpWebSocketHandler)
	{
		return args -> {
			WebSocketClient rsvpSocketClient = new StandardWebSocketClient();
			rsvpSocketClient.doHandshake(rsvpWebSocketHandler, MEETUP_RSVP_ENDPOINT);
		};
	}

}
