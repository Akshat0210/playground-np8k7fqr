package com.tu.code.junit5;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MessengerBoilerplateTest {

	private static final String CLIENT_EMAIL = "someone@somewhere.com";
	private static final String MSG_CONTENT = "Dear SomeOne Welcome";

	private Template template;
	private Client client;
	private MailServer mailServer;
	private Messenger messenger;
	private TemplateEngine templateEngine;

	@BeforeEach
	public void setUp() {
		template = mock(Template.class);
		client = mock(Client.class);
		mailServer = mock(MailServer.class);
		templateEngine = mock(TemplateEngine.class);
		messenger = new Messenger(mailServer, templateEngine);
	}

	@Test
	public void shouldSendEmail() {
		when(client.getEmail()).thenReturn(CLIENT_EMAIL);
		when(templateEngine.prepareMessage(template, client)).thenReturn(MSG_CONTENT);
		messenger.sendMessage(client, template);
		verify(mailServer).send(CLIENT_EMAIL, MSG_CONTENT);
	}
}
